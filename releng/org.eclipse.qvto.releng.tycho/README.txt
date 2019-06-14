The Tycho build automatically promotes downloads and updates, so no cron job help is necessary.

The updates can be checked by looking for the new entry on https://www.eclipse.org/mmt/downloads/?project=qvto
or installing new software from e.g. http://download.eclipse.org/mmt/qvto/updates/milestones/3.9.4/S201805290850

However operations on composite repositories are not automated, partly because they are sufficiently important to deserve manual attention. 

A new milestone build can be added to the composite repository by:

logon to build.eclipse.org
cd ~/downloads/mmt/qvto/updates/milestones/3.9.4
ant -f /shared/modeling/tools/promotion/manage-composite.xml add -Dchild.repository=S201805290850 [ -Dcomposite.name="QVTo 3.9.4 milestones" ]

(This can be checked by installing new software from e.g. http://download.eclipse.org/mmt/qvto/updates/milestones/3.9.4)

The SimRel aggregator is configured by GIT\org.eclipse.simrel.build\mmt-qvto.aggrcon to use an explicit milestone entry

So edit qvto.aggrcon to update 
location="http://download.eclipse.org/mmt/qvto/updates/milestones/3.9.4/S201805290850"
commit with a comment such as [qvto] 3.9.4M5 for Photon and Push to Gerrit (refs/for/master)
If that comes back with SUCCESS, push to master

Once a release has been promoted update mmt-qvto.aggrcon to the final release
location="http://download.eclipse.org/mmt/qvto/updates/releases/3.9.4"

Downloads are accessible at
cd ~/downloads/mmt/qvto/downloads/drops/3.9.4

Archives are accessible at
cd /home/data/httpd/archive.eclipse.org/mmt/qvto/downloads/drops

--------

GIT repo: /gitroot/mmt/org.eclipse.qvto.git

Build periodically: H 3 * * 0
Poll SCM schedule: H */6 * * 1-6

Run XVNC during build

Build:

apache-maven-latest
mvn clean verify -DBUILD_TYPE=$BUILD_TYPE -P sign
releng/org.eclipse.qvto.releng.tycho/pom.xml
BUILD_TYPE=$BUILD_TYPE
BUILD_ALIAS=$BUILD_ALIAS

Path: releng/org.eclipse.qvto.releng.build-site/target/repository
Name: QVTo Tycho %BUILD_TYPE Repository

Publish JUnit test report: tests/*.test*/target/surefire-reports/*.xml,tests/*.test*/target/surefire-reports/*/*.xml

Archive the artefacts: releng/org.eclipse.qvto.releng.build-site/target/*.zip,releng/org.eclipse.qvto.releng.build-site/target/publisher.properties,releng/org.eclipse.qvto.releng.build-site/target/downloads.sh,releng/org.eclipse.qvto.releng.build-site/target/updates.sh

Trigger Promoter when table using releng/org.eclipse.qvto.releng.build-site/target/publisher.properties