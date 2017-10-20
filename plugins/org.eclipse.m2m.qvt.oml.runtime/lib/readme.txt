This folder is a placeholder for the QVTo lib/antTasks.jar Ant task library

For a Tycho build, the declarations in build.properties are sufficient to create the library.

(For a Buckminster build, an invocation of post_build.xml from a org.eclipse.buckminster.ant.AntBuilder .project buildCommand was necessary.)

For interactive Eclipse usage, an invocation of post_build.xml via .externalToolBuilders/AntTasksBuilder.launch from a org.eclipse.ui.externaltools.ExternalToolBuilder .project buildCommand is necessary.