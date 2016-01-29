package org.eclipse.qvto.examples.xtext.qvtoperational.tests;

import org.eclipse.qvto.examples.pivot.qvtoperational.utilities.QVTOperationalToStringVisitor;

public class QVToXtextTestCase extends AbstractQVToXtextTestCase {

	
	public void testOCLInEcoreLoadAsString() throws Exception {
		
		String testFile =			
			"package mm1 : mm1 = 'mm1' {"				
			+	"class c1	{\n"
			+	"	attribute prop1 : String;\n" 
			+	"}\n" 
			+	"class c2 extends c1 {\n"
			+	"	property prop2 : c1;\n"
			+	"}\n"
			+"}";
		doLoadFromString("loadAsString.oclinecore", testFile);
	}
	
	public void testQVToLoadAsString() throws Exception {
				
		String testFile =
			"metamodel mm1 {\n"
			+	"class c1 {\n"
			+	"	prop1 : String ;\n"	
			+	"};\n" 
			+	"class c2 "
			// FIXME not supported yet + "extends c1\n"
			+ " {\n"
			+	"	prop2 : c1;\n"
			+	"};\n"
			+"}";
		doLoadFromString("loadAsString.qvto2", testFile);
	}
	
	public void testSimpleMetamodelDefinition() throws Exception {
		String testFile =
				"metamodel mm1 {\n"
				// FIXME not supported yet+ "	datatype myDataType;\n" 
				+ "	class c1 {\n"
				+ "		prop1 : String;\n"
				+ "	}\n;"
				+ "};";
		doLoadFromString("simpleMetamodelDefinition.qvto2", testFile);
	}
	
	public void testSimpleMetamodelDefinitionWithoutOptionalSemicolon() throws Exception {
		String testFile =
				"metamodel mm1 {\n"
				// FIXME not supported yet+ "	datatype myDataType\n" 
				+ "	class c1 {\n"
				+ "		composes prop1 : String ;\n"
				+ "	}\n"
				+ "}";
		doLoadFromString("simpleMetamodelDefinitionWithouOptionalSemicolon.qvto2", testFile);
	}
	
	public void testModelTypeDeclarations() throws Exception {
		String testFile =
				"modeltype MM1 \"strict\" uses \"m1URI\";\n"
				+ "modeltype MM2 uses \"m2URI\";\n"
				+ "modeltype MM3 uses abc(\"m3URI\");\n"
				+ "modeltype MM2_3 uses \"m2URI\", abc(\"m3URI\");";
		doLoadFromString("modelTypeDeclarations.qvto2", testFile);
	}
	
	public void testSimpleTransformationDeclaration() throws Exception {
		QVTOperationalToStringVisitor.FACTORY.getClass();
		String testFile =
				"modeltype MM1 uses \"m1URI\";\n"
				+ "transformation t1(inout m1 : MM1);";
		doLoadFromString("simpleTransformationDeclaration.qvto2", testFile);
	}
	
	public void testSimpleBlackboxTransformationDeclaration() throws Exception {
		String testFile =
				"modeltype MM1 uses \"m1URI\";\n"
				+ "blackbox transformation t1(inout m1 : MM1);";
		doLoadFromString("simpleBlackboxTransformationDeclaration.qvto2", testFile);
	}
	
	public void testSimpleLibraryDeclaration() throws Exception {
		String testFile =
				"modeltype MM1 uses \"m1URI\";\n"
						+ "library l1(MM1);";
		doLoadFromString("simpleLibraryDeclaration.qvto2", testFile);
	}
	
	public void testSimpleBlackboxLibraryDeclaration() throws Exception {
		String testFile =
				"modeltype MM1 uses \"m1URI\";\n"
						+ "blackbox library l1(MM1);";
		doLoadFromString("simpleBlackboxLibraryDeclaration.qvto2", testFile);
	}
		
	public void testSimpleMappingDefinition() throws Exception {
		String testFile =
				"modeltype MM1 uses \"m1URI\";\n"
				+ " transformation t1(inout m1 : MM1) {\n"
				+ " mapping m1 (in p1 : String);\n"
				+ "}";
		doLoadFromString("simpleMappingDefinition.qvto2", testFile);
	}
	
	public void testAllImperativeOCL() throws Exception {
		String testFile = 
				"modeltype MM1 uses \"m1URI\";\n"						
				+ " transformation t1(inout m1 : MM1) {\n"
				+ " main() {\n"
				+ "	  var coll : List(String) := List{};\n"
				+ "	  do {}; -- Empty block expression\n"
				+ "	  { {} }; -- Nested empty blocks\n"
				+ "	  { var a := \"abc\" }\n"
				+ "	  { var a : String := \"abc\" }\n"
				+ "	  { var a : String := var b : String ::= \"abc\" }\n"
				+ "	  { var a := \"abc\", b := 1}\n"
				+ "	  { return ; } -- Return expression\n" 
				+ "   { compute (x : String = \"abc\") { {} }; }\n"
				+ "   { while ( x <> null) { {} }; }\n"
				+ "   { while (x : String = \"abc\"; x <> null) { {} }; }\n"
				+ "   { coll->forEach(i) { {} }; }\n"
				+ "   { coll->forEach(i : String | i <> null) { {} }; }\n"
				+ "   { coll->xselect(i : String | i <> null); }\n"
				+ "   { coll->xselect(i | i <> null); }\n"
				+ "   { coll->xselectOne(i : String | i <> null); }\n"
				+ "   { coll->xselectOne(i | i <> null); }\n"
				+ "   { coll->xcollect(i : String | i.toUpper()); }\n"
				+ "   { coll->xcollect(i | i.toUpper()); }\n"
				+ "   { coll->xcollect(toUpper()); }\n"
//				+ "   { coll->xcollectselect(i : String ; res := i.toUpper() | res->notEmpty()) ; }\n"
//				+ "   { coll->xcollectselect(i ; res := i.toUpper() | res->notEmpty()); }\n"
//				+ "   { coll->xcollectselect(res := toUpper() | res->notEmpty()); }\n"
//				+ "   { coll->xcollectselectOne(i : String ; res := i.toUpper() | res->notEmpty()); }\n"
//				+ "   { coll->xcollectselectOne(i ; res := i.toUpper() | res->notEmpty()); }\n"
//				+ "   { coll->xcollectselectOne(res := toUpper() | res->notEmpty()); }\n"
				+ "   { if (1 = 2) false elif (2 = 3) false else true endif; }\n"
				+ "   { if (1 = 2) false elif (2 = 3) false elif (3 = 4) false else true; }\n"
				+ "   { switch { case (1 = 2) false case (2 = 3) false case (3 = 4) false else true} ; }\n"
//				+ "   { coll->switch (x) { case (x = 2) false case (x = 3) case (x = 4) false else true; }\n"
				+ "   { coll := Sequence{\"abc\"}; }\n"
				+ "   { coll ::= Sequence{\"abc\"}; }\n"
				+ "   { coll += Sequence{\"abc\"}; }\n"
				+ "   { coll := null default Sequence{\"abc\"}; }\n"
				+ "   { afeature.unlink(anObject); }\n"
				+ "   { try { } except (exp : Exception1, Exception2) {} }\n"
				+ "   { try { } except (exp : Exception1, Exception2) {} except (Exception) {} }\n"
				+ "   { raise StringException(\"problem!!!\"); }\n"
				+ "   { log (\"Logging...\"); }\n"
				+ "   { log (\"Logging...\", coll, warning) when coll->isEmpty(); }\n"
				+ "   { assert coll->notEmpty(); }\n"
				+ "   { assert coll->notEmpty() with log (\"Empty collection\", coll); }\n"
				+ "   { assert fatal coll->notEmpty() with log (\"Empty collection\", coll); }\n"
				+ "   { new String(); }\n"
				+ "   { new String(\"abc\"); }\n"
				+ "   { new EClass@MM1(); }\n"
				+ "  }\n"
				+ "}";
		doLoadFromString("allImperativeOCL.qvto2", testFile);
	}
}
