/* LexerTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. LexerTokenManager.java */
package lexer;
import util.*;
import java.util.Vector;

/** Token Manager. */
@SuppressWarnings("unused")public class LexerTokenManager implements LexerConstants {
    // Use this for error handling
    public static ErrorHandler errorHandler = new ErrorHandler();
    public static final int MAX_STRING_LENGTH = 5000;

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 44;
            return 5;
         }
         if ((active0 & 0x1c0000001beL) != 0L)
         {
            jjmatchedKind = 44;
            return 18;
         }
         if ((active0 & 0x2000000000L) != 0L)
            return 34;
         if ((active0 & 0x1000000000L) != 0L)
         {
            jjmatchedKind = 31;
            return -1;
         }
         if ((active0 & 0x3000000L) != 0L)
            return 23;
         return -1;
      case 1:
         if ((active0 & 0x2000000L) != 0L)
            return 35;
         if ((active0 & 0x10L) != 0L)
            return 18;
         if ((active0 & 0x1c0000001eeL) != 0L)
         {
            jjmatchedKind = 44;
            jjmatchedPos = 1;
            return 18;
         }
         if ((active0 & 0x1000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 31;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 2:
         if ((active0 & 0xc0L) != 0L)
            return 18;
         if ((active0 & 0x1c00000012eL) != 0L)
         {
            jjmatchedKind = 44;
            jjmatchedPos = 2;
            return 18;
         }
         return -1;
      case 3:
         if ((active0 & 0x1c00000010eL) != 0L)
         {
            jjmatchedKind = 44;
            jjmatchedPos = 3;
            return 18;
         }
         if ((active0 & 0x20L) != 0L)
            return 18;
         return -1;
      case 4:
         if ((active0 & 0x400000000aL) != 0L)
            return 18;
         if ((active0 & 0x18000000104L) != 0L)
         {
            jjmatchedKind = 44;
            jjmatchedPos = 4;
            return 18;
         }
         return -1;
      case 5:
         if ((active0 & 0x10000000100L) != 0L)
            return 18;
         if ((active0 & 0x8000000004L) != 0L)
         {
            jjmatchedKind = 44;
            jjmatchedPos = 5;
            return 18;
         }
         return -1;
      case 6:
         if ((active0 & 0x8000000000L) != 0L)
         {
            jjmatchedKind = 44;
            jjmatchedPos = 6;
            return 18;
         }
         if ((active0 & 0x4L) != 0L)
            return 18;
         return -1;
      case 7:
         if ((active0 & 0x8000000000L) != 0L)
         {
            jjmatchedKind = 44;
            jjmatchedPos = 7;
            return 18;
         }
         return -1;
      case 8:
         if ((active0 & 0x8000000000L) != 0L)
         {
            jjmatchedKind = 44;
            jjmatchedPos = 8;
            return 18;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 29;
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 34:
         return jjStartNfaWithStates_0(0, 37, 34);
      case 37:
         return jjStopAtPos(0, 30);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 40:
         return jjStopAtPos(0, 13);
      case 41:
         return jjStopAtPos(0, 14);
      case 42:
         return jjStopAtPos(0, 26);
      case 43:
         jjmatchedKind = 20;
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 44:
         return jjStopAtPos(0, 34);
      case 45:
         jjmatchedKind = 22;
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 46:
         return jjStopAtPos(0, 33);
      case 47:
         jjmatchedKind = 24;
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 59:
         return jjStopAtPos(0, 32);
      case 60:
         jjmatchedKind = 27;
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 61:
         jjmatchedKind = 19;
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 62:
         jjmatchedKind = 28;
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 91:
         return jjStopAtPos(0, 17);
      case 93:
         return jjStopAtPos(0, 18);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x2L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x24L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x8000000010L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x8L);
      case 123:
         return jjStopAtPos(0, 15);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 125:
         return jjStopAtPos(0, 16);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(1, 36);
         break;
      case 42:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(1, 25, 35);
         break;
      case 43:
         if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(1, 21);
         break;
      case 45:
         if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(1, 23);
         break;
      case 61:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(1, 9);
         else if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(1, 10);
         else if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(1, 11);
         else if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(1, 12);
         break;
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x180L);
      case 102:
         if ((active0 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(1, 4, 18);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x8L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x22L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x40L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000000L);
      case 119:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000000L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x4L);
      case 124:
         if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(1, 35);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x2L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000008L);
      case 114:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(2, 6, 18);
         break;
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000020L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x104L);
      case 119:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(2, 7, 18);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000000L);
      case 101:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(3, 5, 18);
         return jjMoveStringLiteralDfa4_0(active0, 0x4L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x8L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x2L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x18000000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000000L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000000L);
      case 101:
         if ((active0 & 0x8L) != 0L)
            return jjStartNfaWithStates_0(4, 3, 18);
         break;
      case 107:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 38, 18);
         break;
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x4L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      case 115:
         if ((active0 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(4, 1, 18);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x4L);
      case 104:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 40, 18);
         break;
      case 110:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(5, 8, 18);
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000000000L);
      case 115:
         if ((active0 & 0x4L) != 0L)
            return jjStartNfaWithStates_0(6, 2, 18);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa8_0(active0, 0x8000000000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa9_0(active0, 0x8000000000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 102:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(9, 39, 18);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 34;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 35:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     { jjCheckNAddStates(0, 2); }
                  else if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 32;
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 31;
                  break;
               case 23:
                  if (curChar == 42)
                     { jjCheckNAddStates(0, 2); }
                  else if (curChar == 47)
                     { jjCheckNAddStates(3, 5); }
                  break;
               case 34:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     { jjCheckNAddStates(6, 9); }
                  else if (curChar == 34)
                  {
                     if (kind > 43)
                        kind = 43;
                  }
                  break;
               case 5:
               case 18:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 44)
                     kind = 44;
                  { jjCheckNAdd(18); }
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     { jjCheckNAdd(1); }
                  }
                  else if ((0x100002600L & l) != 0L)
                  {
                     if (kind > 45)
                        kind = 45;
                  }
                  else if (curChar == 47)
                     { jjAddStates(10, 11); }
                  else if (curChar == 34)
                     { jjCheckNAddStates(6, 9); }
                  else if ((0x8000004000000000L & l) != 0L)
                  {
                     if (kind > 31)
                        kind = 31;
                  }
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  { jjCheckNAdd(1); }
                  break;
               case 10:
                  if (curChar == 34)
                     { jjCheckNAddStates(6, 9); }
                  break;
               case 11:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     { jjCheckNAddStates(6, 9); }
                  break;
               case 13:
                  if ((0xfffffffeffffffffL & l) != 0L)
                     { jjCheckNAddStates(6, 9); }
                  break;
               case 14:
                  if (curChar == 32)
                     { jjCheckNAddStates(6, 9); }
                  break;
               case 16:
                  if (curChar == 34 && kind > 43)
                     kind = 43;
                  break;
               case 19:
                  if ((0x100002600L & l) != 0L && kind > 45)
                     kind = 45;
                  break;
               case 20:
                  if (curChar == 10 && kind > 45)
                     kind = 45;
                  break;
               case 21:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 22:
                  if (curChar == 47)
                     { jjAddStates(10, 11); }
                  break;
               case 24:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     { jjCheckNAddStates(3, 5); }
                  break;
               case 25:
                  if ((0x2400L & l) != 0L && kind > 46)
                     kind = 46;
                  break;
               case 26:
                  if (curChar == 10 && kind > 46)
                     kind = 46;
                  break;
               case 27:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 28:
                  if (curChar == 42)
                     { jjCheckNAddStates(0, 2); }
                  break;
               case 29:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     { jjCheckNAddStates(0, 2); }
                  break;
               case 30:
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 31;
                  break;
               case 31:
                  if ((0xffff7fffffffffffL & l) != 0L)
                     { jjCheckNAddStates(0, 2); }
                  break;
               case 32:
                  if (curChar == 47 && kind > 47)
                     kind = 47;
                  break;
               case 33:
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 35:
               case 29:
               case 31:
                  { jjCheckNAddStates(0, 2); }
                  break;
               case 34:
                  if ((0xffffffffefffffffL & l) != 0L)
                     { jjCheckNAddStates(6, 9); }
                  else if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 14;
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 5:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 44)
                        kind = 44;
                     { jjCheckNAdd(18); }
                  }
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 44)
                        kind = 44;
                     { jjCheckNAdd(18); }
                  }
                  else if (curChar == 64)
                  {
                     if (kind > 31)
                        kind = 31;
                  }
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 8;
                  else if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 2:
                  if (curChar == 101 && kind > 42)
                     kind = 42;
                  break;
               case 3:
                  if (curChar == 115)
                     { jjCheckNAdd(2); }
                  break;
               case 4:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 6:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if (curChar == 117)
                     { jjCheckNAdd(2); }
                  break;
               case 8:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 11:
                  if ((0xffffffffefffffffL & l) != 0L)
                     { jjCheckNAddStates(6, 9); }
                  break;
               case 12:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 13:
                  { jjCheckNAddStates(6, 9); }
                  break;
               case 15:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 17:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 44)
                     kind = 44;
                  { jjCheckNAdd(18); }
                  break;
               case 18:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 44)
                     kind = 44;
                  { jjCheckNAdd(18); }
                  break;
               case 24:
                  { jjAddStates(3, 5); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 35:
               case 29:
               case 31:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjCheckNAddStates(0, 2); }
                  break;
               case 34:
               case 11:
               case 13:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjCheckNAddStates(6, 9); }
                  break;
               case 24:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjAddStates(3, 5); }
                  break;
               default : if (i1 == 0 || l1 == 0 || i2 == 0 ||  l2 == 0) break; else break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 34 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   29, 30, 33, 24, 25, 27, 11, 12, 15, 16, 23, 28, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\143\154\141\163\163", "\145\170\164\145\156\144\163", 
"\167\150\151\154\145", "\151\146", "\145\154\163\145", "\146\157\162", "\156\145\167", 
"\162\145\164\165\162\156", "\74\75", "\76\75", "\75\75", "\41\75", "\50", "\51", "\173", "\175", "\133", 
"\135", "\75", "\53", "\53\53", "\55", "\55\55", "\57", "\57\52", "\52", "\74", "\76", 
"\41", "\45", null, "\73", "\56", "\54", "\174\174", "\46\46", "\42", 
"\142\162\145\141\153", "\151\156\163\164\141\156\143\145\157\146", "\163\167\151\164\143\150", null, 
null, null, null, null, null, null, };
static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      TokenLexicalActions(matchedToken);
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 0 :
      image.setLength(0);
          errorHandler.checkErrors();
         break;
      case 25 :
        image.append(jjstrLiteralImages[25]);
        lengthOfMatch = jjstrLiteralImages[25].length();
      errorHandler.register(errorHandler.LEX_ERROR,
                        Lexer.getCurrFilename(),
                        JavaCharStream.getBeginLine(),
                        "Unterminated multi-line comment starting with /*");
         break;
      case 31 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
      errorHandler.register(errorHandler.LEX_ERROR,
                            Lexer.getCurrFilename(),
                            JavaCharStream.getBeginLine(),
                            "Unsupported character: "+  image.toString());
         break;
      case 37 :
        image.append(jjstrLiteralImages[37]);
        lengthOfMatch = jjstrLiteralImages[37].length();
      errorHandler.register(errorHandler.LEX_ERROR,
                            Lexer.getCurrFilename(),
                            JavaCharStream.getBeginLine(),
                            "Unterminated string starting with \u005c"");
         break;
      case 41 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
        try
        {
          Integer.valueOf(image.toString());
        } catch (Exception e)
        {
          errorHandler.register(errorHandler.LEX_ERROR,
                                Lexer.getCurrFilename(),
                                JavaCharStream.getBeginLine(),
                                "Integer exceeds maximum value allowed: "
                                + image.toString());
        }
         break;
      case 43 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
        if (image.length() > MAX_STRING_LENGTH)
        {
           errorHandler.register(errorHandler.LEX_ERROR,
                            Lexer.getCurrFilename(),
                            JavaCharStream.getBeginLine(),
                            "String constant is too long");
        }
        else if (image.toString().contains("\u005cn"))
        {
          errorHandler.register(errorHandler.LEX_ERROR,
                                Lexer.getCurrFilename(),
                                JavaCharStream.getBeginLine(),
                                "String spans more than one line");
        }
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public LexerTokenManager(JavaCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public LexerTokenManager (JavaCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  static public void ReInit(JavaCharStream stream)
  {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 34; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(JavaCharStream stream, int lexState)
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  static public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1fffffffffffL, 
};
static final long[] jjtoSkip = {
   0xe00000000000L, 
};
    static protected JavaCharStream  input_stream;

    static private final int[] jjrounds = new int[34];
    static private final int[] jjstateSet = new int[2 * 34];

    private static final StringBuilder jjimage = new StringBuilder();
    private static StringBuilder image = jjimage;
    private static int jjimageLen;
    private static int lengthOfMatch;
    
    static protected char curChar;
}
