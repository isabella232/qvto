/**
* <copyright>
*
* Copyright (c) 2005, 2007 IBM Corporation and others.
* All rights reserved.   This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*   IBM - Initial API and implementation
*   E.D.Willink - Lexer and Parser refactoring to support extensibility and flexible error handling
*
* </copyright>
*
* $Id: QvtOpKWLexerprs.java,v 1.15 2008/10/27 12:05:24 aigdalov Exp $
*/
/**
* <copyright>
*
* Copyright (c) 2006-2008 Borland Inc.
* All rights reserved.   This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*   Borland - Initial API and implementation
*
* </copyright>
*
* $Id: QvtOpKWLexerprs.java,v 1.15 2008/10/27 12:05:24 aigdalov Exp $
*/

package org.eclipse.m2m.internal.qvt.oml.cst.parser;

public class QvtOpKWLexerprs implements lpg.lpgjavaruntime.ParseTable, QvtOpKWLexersym {

    public interface IsKeyword {
        public final static byte isKeyword[] = {0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0
        };
    };
    public final static byte isKeyword[] = IsKeyword.isKeyword;
    public final boolean isKeyword(int index) { return isKeyword[index] != 0; }

    public interface BaseCheck {
        public final static byte baseCheck[] = {0,
            4,4,2,4,4,5,3,2,3,3,
            7,3,2,4,5,3,3,8,10,10,
            7,6,6,8,3,3,7,6,6,13,
            8,7,11,11,9,8,14,12,12,12,
            6,7,16,4,7,5,6,7,7,10,
            4,10,1,3,5,3,6,14,6,7,
            9,9,6,8,6,6,7,5,6,5,
            4,3,13,10,12,8,3,4,3,4,
            3,6,4,7,10,9,12,10,13,12,
            15,9,4,5,7,9,6,7,8,8,
            6,6,4,4,6,4,7,8,9,10,
            13,16,7,6,7
        };
    };
    public final static byte baseCheck[] = BaseCheck.baseCheck;
    public final int baseCheck(int index) { return baseCheck[index]; }
    public final static byte rhs[] = baseCheck;
    public final int rhs(int index) { return rhs[index]; };

    public interface BaseAction {
        public final static char baseAction[] = {
            1,2,2,2,2,2,2,2,2,2,
            2,2,2,2,2,2,2,2,2,2,
            2,2,2,2,2,2,2,2,2,2,
            2,2,2,2,2,2,2,2,2,2,
            2,2,2,2,2,2,2,2,2,2,
            2,2,2,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,119,53,54,
            205,206,29,182,207,78,173,104,132,213,
            214,40,216,217,106,18,220,133,145,152,
            91,107,42,34,45,122,79,57,80,222,
            223,226,221,231,228,236,239,240,143,162,
            241,153,233,242,245,135,61,247,248,124,
            254,253,255,256,260,261,163,262,263,266,
            270,271,274,273,278,277,280,283,286,285,
            176,288,287,297,295,299,301,303,166,168,
            167,305,172,185,302,311,304,68,308,313,
            315,316,318,319,323,325,326,327,329,330,
            332,338,340,341,120,69,342,343,344,350,
            352,357,359,187,354,361,363,366,369,368,
            370,371,84,376,378,379,380,385,109,387,
            388,391,390,395,396,393,401,171,403,407,
            409,404,411,413,414,415,416,424,419,425,
            426,428,432,193,433,434,436,437,441,442,
            445,449,117,446,452,450,455,457,458,459,
            460,461,464,467,471,475,465,469,477,482,
            483,484,478,486,489,490,491,495,496,504,
            505,500,508,510,512,514,516,520,522,518,
            523,528,524,530,535,531,533,537,539,540,
            543,544,548,552,549,553,555,557,558,561,
            559,569,564,572,573,575,576,577,579,562,
            581,583,586,587,592,595,596,597,599,602,
            603,609,611,600,614,616,621,617,625,607,
            618,612,626,629,630,633,636,637,638,639,
            640,644,648,643,655,649,658,651,65,657,
            661,662,663,667,669,670,671,672,673,677,
            682,684,676,687,686,688,690,694,691,702,
            706,699,695,703,710,711,714,715,719,716,
            726,728,720,731,730,734,735,736,740,741,
            743,737,745,748,749,750,752,754,759,761,
            763,764,766,765,771,772,773,775,779,780,
            782,786,787,790,791,792,793,794,795,797,
            800,192,803,129,802,804,805,807,814,816,
            820,175,821,822,823,824,826,829,835,839,
            830,840,841,842,843,848,849,850,853,857,
            856,859,863,864,868,870,874,865,876,877,
            879,880,882,885,886,889,883,892,896,707,
            897,898,899,902,901,906,908,909,914,916,
            912,918,920,924,925,926,928,931,932,934,
            935,936,938,939,940,945,948,954,955,959,
            960,950,961,962,967,194,968,971,974,972,
            976,978,982,980,984,985,988,989,993,997,
            995,999,1001,1000,1004,1006,1008,1010,1012,1013,
            1016,1014,1018,1020,1022,1027,1028,579,579
        };
    };
    public final static char baseAction[] = BaseAction.baseAction;
    public final int baseAction(int index) { return baseAction[index]; }
    public final static char lhs[] = baseAction;
    public final int lhs(int index) { return lhs[index]; };

    public interface TermCheck {
        public final static byte termCheck[] = {0,
            0,1,2,3,4,5,6,7,8,9,
            10,11,12,13,14,0,16,0,18,19,
            20,21,22,23,7,25,26,10,0,29,
            30,31,32,0,34,7,3,9,38,0,
            7,0,3,10,0,12,5,3,4,5,
            9,10,0,0,10,22,0,16,2,3,
            0,5,2,3,0,5,22,0,0,2,
            14,3,16,6,14,7,9,0,0,0,
            1,2,18,0,24,7,19,20,9,12,
            0,1,28,40,30,31,6,19,8,9,
            36,18,23,0,1,0,0,1,0,4,
            27,8,9,8,9,9,0,1,12,0,
            37,0,39,0,3,4,3,4,0,21,
            14,0,0,5,0,27,2,6,19,16,
            8,9,0,35,0,1,2,26,6,21,
            19,0,0,1,20,13,28,0,6,8,
            9,0,0,2,2,0,0,0,7,2,
            0,0,0,6,0,0,11,11,6,8,
            14,0,17,12,0,1,0,25,18,8,
            6,0,0,0,20,9,4,27,12,24,
            9,9,9,29,0,0,0,1,4,18,
            5,18,0,0,1,0,0,1,3,0,
            0,0,0,1,12,0,0,0,9,8,
            0,4,0,13,9,0,1,7,0,0,
            0,0,2,5,0,13,0,0,4,8,
            11,5,0,0,0,0,9,4,4,0,
            0,0,0,11,9,0,4,7,7,0,
            0,2,0,0,15,2,0,0,2,0,
            15,4,0,1,0,0,0,0,9,2,
            4,7,22,8,0,23,0,1,0,5,
            0,0,0,0,0,5,4,0,10,5,
            0,1,0,6,0,0,13,0,0,4,
            8,7,0,5,0,0,0,10,0,0,
            1,0,31,7,3,13,12,0,13,0,
            0,0,0,0,0,4,4,4,8,0,
            13,0,24,0,15,6,0,1,0,8,
            0,8,0,1,6,0,1,0,0,0,
            0,0,12,5,4,0,1,0,0,0,
            13,4,4,14,0,6,0,0,1,0,
            0,5,0,4,0,0,12,7,4,4,
            0,1,0,0,2,13,0,1,0,1,
            0,1,0,0,0,0,1,5,0,1,
            6,18,9,0,0,0,3,0,3,5,
            3,0,0,0,1,0,0,1,7,7,
            0,0,2,2,0,0,2,12,0,0,
            2,0,1,4,0,1,0,0,0,0,
            0,1,4,0,0,6,0,1,0,12,
            0,1,4,17,0,1,0,0,33,16,
            16,0,0,0,3,0,4,4,0,0,
            0,15,7,16,0,0,1,0,10,0,
            6,12,12,0,0,1,3,0,9,0,
            3,0,1,0,1,0,7,0,3,0,
            1,0,0,0,3,8,4,0,1,0,
            0,8,0,4,0,1,0,5,0,0,
            10,5,0,0,5,7,3,0,0,7,
            3,0,0,2,0,7,0,0,0,5,
            0,0,6,0,6,8,14,7,0,1,
            7,0,0,2,0,0,0,1,0,7,
            0,6,0,22,10,0,0,7,10,3,
            8,0,7,2,0,0,0,3,0,0,
            5,0,0,1,6,9,0,6,0,1,
            0,0,2,0,1,0,0,0,3,20,
            0,15,2,7,0,0,2,10,0,0,
            5,20,0,1,6,0,0,0,0,0,
            1,3,0,0,8,10,17,0,0,7,
            0,4,15,10,0,1,0,0,10,2,
            0,0,0,2,8,5,0,5,0,0,
            0,0,0,5,2,0,0,11,2,10,
            30,0,1,0,14,0,0,0,5,0,
            0,16,6,0,0,2,25,10,0,9,
            11,0,0,2,19,0,0,2,10,0,
            0,17,2,0,0,0,1,15,0,0,
            11,7,16,5,11,0,1,0,1,0,
            0,12,2,0,0,0,0,8,5,0,
            0,2,0,3,0,11,11,0,0,0,
            2,0,10,0,3,19,3,10,0,1,
            0,17,0,0,0,0,17,2,6,5,
            0,0,0,10,0,1,6,17,0,0,
            9,0,1,5,12,0,0,2,9,0,
            0,0,0,0,0,2,0,1,6,0,
            1,0,0,0,0,4,0,13,17,7,
            21,8,6,0,1,0,26,2,32,0,
            0,0,0,0,0,0,3,2,0,0,
            1,11,13,29,0,13,8,3,0,0,
            0,0,0,4,23,7,5,0,0,0,
            3,11,0,1,5,0,0,9,0,17,
            4,3,0,0,0,3,11,0,1,0,
            6,8,3,0,1,0,0,1,0,0,
            1,0,0,2,0,0,1,9,0,1,
            15,0,8,11,3,0,0,0,0,1,
            0,0,0,6,3,0,1,0,0,2,
            15,0,4,0,1,0,20,0,1,0,
            5,2,11,0,0,0,3,0,28,4,
            0,0,8,0,0,0,1,0,0,0,
            0,14,8,10,0,8,8,0,1,0,
            6,21,21,0,0,2,2,18,0,0,
            0,0,1,14,6,6,0,0,2,2,
            0,0,2,0,14,0,3,0,1,0,
            9,0,1,0,0,10,3,0,0,5,
            11,3,0,6,0,3,0,1,0,0,
            0,3,2,0,1,0,12,0,1,0,
            11,0,0,0,9,0,7,0,3,0,
            0,0,3,11,3,8,0,0,1,0,
            4,18,21,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0
        };
    };
    public final static byte termCheck[] = TermCheck.termCheck;
    public final int termCheck(int index) { return termCheck[index]; }

    public interface TermAction {
        public final static char termAction[] = {0,
            579,145,146,141,140,148,147,133,144,143,
            134,126,121,122,139,579,127,579,132,124,
            123,135,120,128,171,125,142,170,579,138,
            129,131,137,579,136,151,193,152,130,579,
            587,579,164,192,579,191,187,198,197,196,
            189,186,579,579,195,190,579,188,205,207,
            579,204,235,234,579,233,194,13,579,275,
            582,650,206,278,232,293,276,579,579,579,
            211,209,436,579,236,202,277,274,210,155,
            579,182,438,578,439,437,181,203,180,179,
            440,309,208,579,159,579,579,183,579,168,
            312,158,157,167,169,185,579,348,184,579,
            310,579,311,579,200,201,240,241,27,318,
            580,579,579,494,579,320,231,160,662,239,
            174,173,579,319,579,176,175,199,220,495,
            161,579,579,225,230,221,496,579,226,178,
            177,579,579,223,595,579,579,579,222,262,
            579,579,579,263,579,579,586,265,156,267,
            264,579,604,268,579,270,579,247,327,153,
            269,84,579,88,503,301,340,326,300,256,
            492,339,558,502,579,579,579,154,149,491,
            150,557,579,579,163,579,579,166,165,579,
            579,579,579,213,162,579,579,579,172,212,
            579,216,579,215,214,579,217,651,579,579,
            579,579,224,218,579,227,579,579,229,228,
            219,237,579,579,579,579,238,242,244,579,
            579,579,579,243,245,579,249,246,248,579,
            579,250,579,579,596,591,579,579,589,579,
            660,252,579,254,579,579,579,579,253,635,
            257,588,251,255,579,658,579,605,579,258,
            579,579,579,579,579,260,261,579,259,266,
            579,272,579,279,579,579,273,579,579,282,
            280,281,579,672,579,579,579,283,579,579,
            289,579,271,287,682,284,285,77,286,579,
            579,579,579,579,579,294,295,623,292,579,
            290,579,288,579,291,296,579,298,579,297,
            579,302,579,304,299,579,685,579,579,579,
            579,579,303,305,308,579,313,579,579,579,
            306,314,315,307,579,316,579,579,659,579,
            579,321,579,630,579,579,317,322,323,324,
            579,325,579,579,328,657,579,329,579,330,
            579,332,579,579,54,579,584,333,579,593,
            335,331,334,579,579,579,336,579,583,683,
            337,579,579,579,342,579,579,344,338,341,
            579,579,581,345,579,579,346,343,579,579,
            347,579,350,351,579,352,579,579,579,579,
            579,356,354,579,579,355,579,673,579,353,
            579,634,359,647,579,625,579,579,349,357,
            358,579,579,579,361,579,362,363,579,579,
            579,360,365,364,579,579,370,579,366,579,
            369,367,368,579,579,372,371,579,373,579,
            374,579,376,579,377,579,375,579,378,579,
            379,579,579,579,380,381,382,579,594,579,
            579,383,579,384,579,385,579,387,579,579,
            386,388,579,579,390,389,392,579,579,391,
            393,579,579,394,579,395,579,579,579,396,
            579,579,397,579,400,398,585,399,579,401,
            402,579,579,649,579,579,579,406,579,403,
            579,405,579,408,404,579,579,409,407,411,
            410,579,648,412,579,579,579,413,579,579,
            642,579,579,417,415,414,579,416,579,418,
            579,579,681,579,645,579,579,579,644,419,
            579,422,608,420,579,579,421,423,579,579,
            425,424,579,427,426,579,579,579,579,579,
            693,430,579,579,429,428,626,579,579,432,
            579,601,620,431,579,433,579,579,434,636,
            579,579,579,661,441,676,579,442,579,579,
            579,579,579,602,447,579,579,443,638,444,
            435,579,448,579,445,579,579,579,449,579,
            579,450,451,579,579,453,446,680,579,454,
            452,579,579,455,684,579,579,456,457,579,
            579,458,460,579,579,579,461,646,579,579,
            459,621,530,674,628,579,611,579,694,579,
            579,462,463,579,579,579,579,464,465,579,
            579,467,579,624,579,627,466,579,579,579,
            686,579,468,579,471,692,472,469,579,473,
            579,639,579,579,579,579,470,477,475,677,
            579,579,579,476,579,600,478,474,579,579,
            479,579,482,590,480,579,579,483,481,28,
            579,579,579,579,579,487,579,489,486,579,
            490,579,579,579,579,497,579,488,655,493,
            485,498,500,579,597,579,678,687,484,579,
            579,579,579,579,579,579,506,679,579,579,
            603,504,501,499,579,505,507,508,579,579,
            579,579,579,510,615,509,643,579,579,579,
            512,511,579,671,641,579,579,513,579,610,
            640,665,579,579,579,515,514,579,517,579,
            520,516,518,579,519,579,579,522,579,579,
            614,579,579,524,579,579,526,523,579,527,
            521,579,525,528,529,579,579,579,579,688,
            579,579,579,532,653,579,534,579,579,535,
            675,579,536,579,689,579,531,579,629,579,
            537,599,631,579,579,579,598,579,533,539,
            579,579,538,579,579,579,545,579,579,85,
            579,540,544,543,579,546,547,579,550,579,
            549,541,542,579,579,551,552,548,579,579,
            579,579,555,613,553,554,579,579,556,559,
            579,579,560,579,612,579,666,579,563,579,
            561,579,618,579,579,562,564,579,579,619,
            617,669,579,565,579,566,579,654,579,579,
            579,652,568,579,569,579,567,579,571,579,
            609,111,579,89,570,579,572,579,637,579,
            579,579,576,616,670,575,579,579,691,579,
            622,574,573
        };
    };
    public final static char termAction[] = TermAction.termAction;
    public final int termAction(int index) { return termAction[index]; }
    public final int asb(int index) { return 0; }
    public final int asr(int index) { return 0; }
    public final int nasb(int index) { return 0; }
    public final int nasr(int index) { return 0; }
    public final int terminalIndex(int index) { return 0; }
    public final int nonterminalIndex(int index) { return 0; }
    public final int scopePrefix(int index) { return 0;}
    public final int scopeSuffix(int index) { return 0;}
    public final int scopeLhs(int index) { return 0;}
    public final int scopeLa(int index) { return 0;}
    public final int scopeStateSet(int index) { return 0;}
    public final int scopeRhs(int index) { return 0;}
    public final int scopeState(int index) { return 0;}
    public final int inSymb(int index) { return 0;}
    public final String name(int index) { return null; }
    public final int getErrorSymbol() { return 0; }
    public final int getScopeUbound() { return 0; }
    public final int getScopeSize() { return 0; }
    public final int getMaxNameLength() { return 0; }

    public final static int
           NUM_STATES        = 459,
           NT_OFFSET         = 54,
           LA_STATE_OFFSET   = 694,
           MAX_LA            = 1,
           NUM_RULES         = 115,
           NUM_NONTERMINALS  = 3,
           NUM_SYMBOLS       = 57,
           SEGMENT_SIZE      = 8192,
           START_STATE       = 116,
           IDENTIFIER_SYMBOL = 0,
           EOFT_SYMBOL       = 40,
           EOLT_SYMBOL       = 55,
           ACCEPT_ACTION     = 578,
           ERROR_ACTION      = 579;

    public final static boolean BACKTRACK = false;

    public final int getNumStates() { return NUM_STATES; }
    public final int getNtOffset() { return NT_OFFSET; }
    public final int getLaStateOffset() { return LA_STATE_OFFSET; }
    public final int getMaxLa() { return MAX_LA; }
    public final int getNumRules() { return NUM_RULES; }
    public final int getNumNonterminals() { return NUM_NONTERMINALS; }
    public final int getNumSymbols() { return NUM_SYMBOLS; }
    public final int getSegmentSize() { return SEGMENT_SIZE; }
    public final int getStartState() { return START_STATE; }
    public final int getStartSymbol() { return lhs[0]; }
    public final int getIdentifierSymbol() { return IDENTIFIER_SYMBOL; }
    public final int getEoftSymbol() { return EOFT_SYMBOL; }
    public final int getEoltSymbol() { return EOLT_SYMBOL; }
    public final int getAcceptAction() { return ACCEPT_ACTION; }
    public final int getErrorAction() { return ERROR_ACTION; }
    public final boolean isValidForParser() { return isValidForParser; }
    public final boolean getBacktrack() { return BACKTRACK; }

    public final int originalState(int state) { return 0; }
    public final int asi(int state) { return 0; }
    public final int nasi(int state) { return 0; }
    public final int inSymbol(int state) { return 0; }

    public final int ntAction(int state, int sym) {
        return baseAction[state + sym];
    }

    public final int tAction(int state, int sym) {
        int i = baseAction[state],
            k = i + sym;
        return termAction[termCheck[k] == sym ? k : i];
    }
    public final int lookAhead(int la_state, int sym) {
        int k = la_state + sym;
        return termAction[termCheck[k] == sym ? k : la_state];
    }
}
