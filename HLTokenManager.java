/* HLTokenManager.java */
/* Generated By:JJTree&JavaCC: Do not edit this line. HLTokenManager.java */

/** Token Manager. */
public class HLTokenManager implements HLConstants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 9:
         jjmatchedKind = 2;
         return jjMoveNfa_0(1, 0);
      case 10:
         jjmatchedKind = 3;
         return jjMoveNfa_0(1, 0);
      case 13:
         jjmatchedKind = 4;
         return jjMoveNfa_0(1, 0);
      case 32:
         jjmatchedKind = 1;
         return jjMoveNfa_0(1, 0);
      case 33:
         jjmatchedKind = 18;
         return jjMoveStringLiteralDfa1_0(0x10000000400L);
      case 35:
         return jjMoveStringLiteralDfa1_0(0x30000000L);
      case 37:
         jjmatchedKind = 15;
         return jjMoveNfa_0(1, 0);
      case 38:
         jjmatchedKind = 16;
         return jjMoveNfa_0(1, 0);
      case 40:
         jjmatchedKind = 20;
         return jjMoveNfa_0(1, 0);
      case 41:
         jjmatchedKind = 23;
         return jjMoveNfa_0(1, 0);
      case 42:
         jjmatchedKind = 13;
         return jjMoveNfa_0(1, 0);
      case 43:
         jjmatchedKind = 11;
         return jjMoveNfa_0(1, 0);
      case 44:
         jjmatchedKind = 26;
         return jjMoveNfa_0(1, 0);
      case 45:
         jjmatchedKind = 12;
         return jjMoveNfa_0(1, 0);
      case 47:
         jjmatchedKind = 14;
         return jjMoveNfa_0(1, 0);
      case 59:
         jjmatchedKind = 27;
         return jjMoveNfa_0(1, 0);
      case 60:
         jjmatchedKind = 5;
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 61:
         jjmatchedKind = 19;
         return jjMoveStringLiteralDfa1_0(0x8000000200L);
      case 62:
         jjmatchedKind = 7;
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 68:
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x380000000L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x1c00000000L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x6000000000L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x60000000000L);
      case 82:
         return jjMoveStringLiteralDfa1_0(0x80000000000L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x100000000000L);
      case 86:
         return jjMoveStringLiteralDfa1_0(0x200000000000L);
      case 87:
         return jjMoveStringLiteralDfa1_0(0x400000000000L);
      case 91:
         jjmatchedKind = 22;
         return jjMoveNfa_0(1, 0);
      case 93:
         jjmatchedKind = 25;
         return jjMoveNfa_0(1, 0);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x380000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x1c00000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x6000000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x60000000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x80000000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x100000000000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x200000000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x400000000000L);
      case 123:
         jjmatchedKind = 21;
         return jjMoveNfa_0(1, 0);
      case 124:
         jjmatchedKind = 17;
         return jjMoveNfa_0(1, 0);
      case 125:
         jjmatchedKind = 24;
         return jjMoveNfa_0(1, 0);
      default :
         return jjMoveNfa_0(1, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(1, 0);
   }
   switch(curChar)
   {
      case 48:
         if ((active0 & 0x20000000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 1;
         }
         break;
      case 49:
         if ((active0 & 0x10000000L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 1;
         }
         break;
      case 61:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 6;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 8;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 9;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 1;
         }
         break;
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000000000L);
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000000L);
      case 70:
         if ((active0 & 0x2000000000L) != 0L)
         {
            jjmatchedKind = 37;
            jjmatchedPos = 1;
         }
         break;
      case 72:
         return jjMoveStringLiteralDfa2_0(active0, 0x500000000000L);
      case 73:
         if ((active0 & 0x400000000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x18000000000L);
      case 76:
         return jjMoveStringLiteralDfa2_0(active0, 0x180000000L);
      case 78:
         if ((active0 & 0x4000000000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x200000000L);
      case 79:
         if ((active0 & 0x40000000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x800000000L);
      case 82:
         return jjMoveStringLiteralDfa2_0(active0, 0x60000000000L);
      case 85:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000000L);
      case 102:
         if ((active0 & 0x2000000000L) != 0L)
         {
            jjmatchedKind = 37;
            jjmatchedPos = 1;
         }
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x500000000000L);
      case 105:
         if ((active0 & 0x400000000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x18000000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x180000000L);
      case 110:
         if ((active0 & 0x4000000000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x200000000L);
      case 111:
         if ((active0 & 0x40000000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x800000000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x60000000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000L);
      default :
         break;
   }
   return jjMoveNfa_0(1, 1);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(1, 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(1, 1);
   }
   switch(curChar)
   {
      case 68:
         if ((active0 & 0x200000000L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 2;
         }
         break;
      case 69:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000000L);
      case 73:
         return jjMoveStringLiteralDfa3_0(active0, 0x460080000000L);
      case 78:
         if ((active0 & 0x8000000000L) != 0L)
         {
            jjmatchedKind = 39;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x10000000000L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000000L);
      case 82:
         if ((active0 & 0x800000000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x200000000000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 2;
         }
         break;
      case 83:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000L);
      case 84:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000000L);
      case 100:
         if ((active0 & 0x200000000L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 2;
         }
         break;
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x460080000000L);
      case 110:
         if ((active0 & 0x8000000000L) != 0L)
         {
            jjmatchedKind = 39;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x10000000000L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000000L);
      case 114:
         if ((active0 & 0x800000000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x200000000000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 2;
         }
         break;
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000000L);
      default :
         break;
   }
   return jjMoveNfa_0(1, 2);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(1, 2);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(1, 2);
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000000L);
      case 69:
         if ((active0 & 0x100000000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 3;
         }
         break;
      case 70:
         if ((active0 & 0x80000000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 3;
         }
         break;
      case 76:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000000L);
      case 78:
         if ((active0 & 0x100000000000L) != 0L)
         {
            jjmatchedKind = 44;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x60000000000L);
      case 85:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000000L);
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000000L);
      case 101:
         if ((active0 & 0x100000000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 3;
         }
         break;
      case 102:
         if ((active0 & 0x80000000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 3;
         }
         break;
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000000L);
      case 110:
         if ((active0 & 0x100000000000L) != 0L)
         {
            jjmatchedKind = 44;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x60000000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000000L);
      default :
         break;
   }
   return jjMoveNfa_0(1, 3);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(1, 3);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(1, 3);
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x400000000000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 4;
         }
         break;
      case 82:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000000L);
      case 84:
         if ((active0 & 0x20000000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x41000000000L);
      case 101:
         if ((active0 & 0x400000000000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 4;
         }
         break;
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000000L);
      case 116:
         if ((active0 & 0x20000000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x41000000000L);
      default :
         break;
   }
   return jjMoveNfa_0(1, 4);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(1, 4);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(1, 4);
   }
   switch(curChar)
   {
      case 73:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000000L);
      case 76:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000000000L);
      case 78:
         if ((active0 & 0x80000000000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 5;
         }
         break;
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000000L);
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000000000L);
      case 110:
         if ((active0 & 0x80000000000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 5;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(1, 5);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(1, 5);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(1, 5);
   }
   switch(curChar)
   {
      case 78:
         if ((active0 & 0x40000000000L) != 0L)
         {
            jjmatchedKind = 42;
            jjmatchedPos = 6;
         }
         break;
      case 79:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000000L);
      case 110:
         if ((active0 & 0x40000000000L) != 0L)
         {
            jjmatchedKind = 42;
            jjmatchedPos = 6;
         }
         break;
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000000L);
      default :
         break;
   }
   return jjMoveNfa_0(1, 6);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(1, 6);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(1, 6);
   }
   switch(curChar)
   {
      case 78:
         if ((active0 & 0x1000000000L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 7;
         }
         break;
      case 110:
         if ((active0 & 0x1000000000L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 7;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(1, 7);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int strKind = jjmatchedKind;
   int strPos = jjmatchedPos;
   int seenUpto;
   input_stream.backup(seenUpto = curPos + 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { throw new Error("Internal Error"); }
   curPos = 0;
   int startsAt = 0;
   jjnewStateCnt = 17;
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
               case 1:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 51)
                        kind = 51;
                     { jjCheckNAdd(0); }
                  }
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 11;
                  else if (curChar == 34)
                     { jjCheckNAddTwoStates(9, 10); }
                  else if (curChar == 35)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  { jjCheckNAdd(0); }
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 53)
                     kind = 53;
                  jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 5:
                  if (curChar == 35)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 54)
                     kind = 54;
                  jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 8:
                  if (curChar == 34)
                     { jjCheckNAddTwoStates(9, 10); }
                  break;
               case 9:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(9, 10); }
                  break;
               case 10:
                  if (curChar == 34 && kind > 55)
                     kind = 55;
                  break;
               case 11:
                  if (curChar == 47)
                     { jjCheckNAddStates(0, 2); }
                  break;
               case 12:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     { jjCheckNAddStates(0, 2); }
                  break;
               case 13:
                  if ((0x2400L & l) != 0L && kind > 56)
                     kind = 56;
                  break;
               case 14:
                  if (curChar == 10 && kind > 56)
                     kind = 56;
                  break;
               case 15:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 11;
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
               case 1:
                  if ((0x7fffffeL & l) != 0L)
                  {
                     if (kind > 53)
                        kind = 53;
                     { jjCheckNAdd(4); }
                  }
                  else if ((0x7fffffe00000000L & l) != 0L)
                  {
                     if (kind > 52)
                        kind = 52;
                     { jjCheckNAdd(2); }
                  }
                  break;
               case 2:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  { jjCheckNAdd(2); }
                  break;
               case 3:
                  if ((0x7fffffeL & l) == 0L)
                     break;
                  if (kind > 53)
                     kind = 53;
                  { jjCheckNAdd(4); }
                  break;
               case 4:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 53)
                     kind = 53;
                  { jjCheckNAdd(4); }
                  break;
               case 6:
               case 7:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 54)
                     kind = 54;
                  { jjCheckNAdd(7); }
                  break;
               case 9:
                  { jjAddStates(3, 4); }
                  break;
               case 12:
                  { jjAddStates(0, 2); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 9:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(3, 4); }
                  break;
               case 12:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(0, 2); }
                  break;
               default : break;
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
      if ((i = jjnewStateCnt) == (startsAt = 17 - (jjnewStateCnt = startsAt)))
         break;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { break; }
   }
   if (jjmatchedPos > strPos)
      return curPos;

   int toRet = Math.max(curPos, seenUpto);

   if (curPos < toRet)
      for (i = toRet - Math.min(curPos, seenUpto); i-- > 0; )
         try { curChar = input_stream.readChar(); }
         catch(java.io.IOException e) { throw new Error("Internal Error : Please send a bug report."); }

   if (jjmatchedPos < strPos)
   {
      jjmatchedKind = strKind;
      jjmatchedPos = strPos;
   }
   else if (jjmatchedPos == strPos && jjmatchedKind > strKind)
      jjmatchedKind = strKind;

   return toRet;
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\74", "\74\75", "\76", "\76\75", "\75\75", 
"\41\75", "\53", "\55", "\52", "\57", "\45", "\46", "\174", "\41", "\75", "\50", "\173", 
"\133", "\51", "\175", "\135", "\54", "\73", "\43\61", "\43\60", null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, };
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
static final int[] jjnextStates = {
   12, 13, 15, 9, 10, 
};

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }

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
         matchedToken.specialToken = specialToken;
         return matchedToken;
      }
      else
      {
         if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
         {
            matchedToken = jjFillToken();
            if (specialToken == null)
               specialToken = matchedToken;
            else
            {
               matchedToken.specialToken = specialToken;
               specialToken = (specialToken.next = matchedToken);
            }
         }
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

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
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
    public HLTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public HLTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  static public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 17; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public static void SwitchTo(int lexState)
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

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xf87fffffffffe1L, 
};
static final long[] jjtoSkip = {
   0x10000000000001eL, 
};
static final long[] jjtoSpecial = {
   0x100000000000000L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[17];
    static private final int[] jjstateSet = new int[2 * 17];
    private static final StringBuilder jjimage = new StringBuilder();
    private static StringBuilder image = jjimage;
    private static int jjimageLen;
    private static int lengthOfMatch;
    static protected int curChar;
}
