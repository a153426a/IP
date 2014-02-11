package lexerAndParser;
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Tue Feb 11 15:35:51 GMT 2014
//----------------------------------------------------

import java_cup.runtime.*;
import ast.*;

/** CUP v0.10k generated parser.
  * @version Tue Feb 11 15:35:51 GMT 2014
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\022\000\002\003\005\000\002\002\004\000\002\003" +
    "\003\000\002\003\003\000\002\003\003\000\002\003\003" +
    "\000\002\003\003\000\002\007\003\000\002\004\003\000" +
    "\002\006\004\000\002\005\003\000\002\005\003\000\002" +
    "\005\003\000\002\005\003\000\002\010\005\000\002\011" +
    "\005\000\002\012\005\000\002\013\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\033\000\014\007\011\010\010\013\016\016\020\021" +
    "\014\001\002\000\016\002\ufff5\004\ufff5\005\ufff5\006\ufff5" +
    "\012\ufff5\017\ufff5\001\002\000\016\002\ufffd\004\ufffd\005" +
    "\ufffd\006\ufffd\012\ufffd\017\ufffd\001\002\000\016\002\ufffb" +
    "\004\ufffb\005\ufffb\006\ufffb\012\ufffb\017\ufffb\001\002\000" +
    "\014\002\035\004\024\005\026\006\027\012\023\001\002" +
    "\000\016\002\ufffe\004\ufffe\005\ufffe\006\ufffe\012\ufffe\017" +
    "\ufffe\001\002\000\016\002\uffff\004\uffff\005\uffff\006\uffff" +
    "\012\uffff\017\uffff\001\002\000\016\002\ufff9\004\ufff9\005" +
    "\ufff9\006\ufff9\012\ufff9\017\ufff9\001\002\000\016\002\ufff7" +
    "\004\ufff7\005\ufff7\006\ufff7\012\ufff7\017\ufff7\001\002\000" +
    "\016\002\ufffa\004\ufffa\005\ufffa\006\ufffa\012\ufffa\017\ufffa" +
    "\001\002\000\016\002\ufffc\004\ufffc\005\ufffc\006\ufffc\012" +
    "\ufffc\017\ufffc\001\002\000\014\007\011\010\010\013\016" +
    "\016\020\021\014\001\002\000\016\002\ufff4\004\ufff4\005" +
    "\ufff4\006\ufff4\012\ufff4\017\ufff4\001\002\000\014\007\011" +
    "\010\010\013\016\016\020\021\014\001\002\000\016\002" +
    "\ufff6\004\ufff6\005\ufff6\006\ufff6\012\ufff6\017\ufff6\001\002" +
    "\000\014\004\024\005\026\006\027\012\023\017\025\001" +
    "\002\000\014\007\011\010\010\013\016\016\020\021\014" +
    "\001\002\000\014\007\011\010\010\013\016\016\020\021" +
    "\014\001\002\000\016\002\001\004\001\005\001\006\001" +
    "\012\001\017\001\001\002\000\014\007\011\010\010\013" +
    "\016\016\020\021\014\001\002\000\014\007\011\010\010" +
    "\013\016\016\020\021\014\001\002\000\016\002\ufff2\004" +
    "\ufff2\005\026\006\ufff2\012\023\017\ufff2\001\002\000\016" +
    "\002\ufff0\004\ufff0\005\ufff0\006\ufff0\012\ufff0\017\ufff0\001" +
    "\002\000\016\002\ufff3\004\ufff3\005\026\006\027\012\023" +
    "\017\ufff3\001\002\000\016\002\ufff1\004\ufff1\005\026\006" +
    "\ufff1\012\ufff1\017\ufff1\001\002\000\016\002\ufff8\004\024" +
    "\005\026\006\027\012\023\017\ufff8\001\002\000\004\002" +
    "\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\033\000\024\003\006\004\014\005\005\006\011\007" +
    "\004\010\012\011\020\012\003\013\016\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\024\003\033\004\014\005\005\006\011\007\004\010\012" +
    "\011\020\012\003\013\016\001\001\000\002\001\001\000" +
    "\024\003\021\004\014\005\005\006\011\007\004\010\012" +
    "\011\020\012\003\013\016\001\001\000\002\001\001\000" +
    "\002\001\001\000\024\003\032\004\014\005\005\006\011" +
    "\007\004\010\012\011\020\012\003\013\016\001\001\000" +
    "\024\003\031\004\014\005\005\006\011\007\004\010\012" +
    "\011\020\012\003\013\016\001\001\000\002\001\001\000" +
    "\024\003\030\004\014\005\005\006\011\007\004\010\012" +
    "\011\020\012\003\013\016\001\001\000\024\003\027\004" +
    "\014\005\005\006\011\007\004\010\012\011\020\012\003" +
    "\013\016\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


   
    /* Change the method report_error so it will display the line and  
       column of where the error occurred in the input as well as the  
       reason for the error which is passed into the method in the  
       String âmessageâ. */   
    public void report_error(String message, Object info) {   
        /* Create a StringBuffer called âmâ with the string âErrorâ in it. */   
        StringBuffer m = new StringBuffer("Error");   
        /* Check if the information passed to the method is the same  
           type as the type java_cup.runtime.Symbol. */   
        if (info instanceof java_cup.runtime.Symbol) {   
            /* Declare a java_cup.runtime.Symbol object âsâ with the  
               information in the object info that is being typecasted  
               as a java_cup.runtime.Symbol object. */   
            java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);   
            /* Check if the line number in the input is greater or  
               equal to zero. */   
            if (s.left >= 0) {                  
                /* Add to the end of the StringBuffer error message  
                   the line number of the error in the input. */   
                m.append(" in line "+(s.left+1));     
                /* Check if the column number in the input is greater  
                   or equal to zero. */   
                if (s.right >= 0)                      
                    /* Add to the end of the StringBuffer error message  
                       the column number of the error in the input. */   
                    m.append(", column "+(s.right+1));   
            }   
        }   
        /* Add to the end of the StringBuffer error message created in  
           this method the message that was passed into this method. */   
        m.append(" : "+message);   
        /* Print the contents of the StringBuffer âmâ, which contains  
           an error message, out on a line. */   
        System.err.println(m);   
    }   
    /* Change the method report_fatal_error so when it reports a fatal  
       error it will display the line and column number of where the  
       fatal error occurred in the input as well as the reason for the  
       fatal error which is passed into the method in the object  
       âmessageâ and then exit.*/   
    public void report_fatal_error(String message, Object info) {   
        report_error(message, info);   
        System.exit(1);   
    }   

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // IFFStatement ::= LogicStatement IFF LogicStatement 
            {
              LogicStatement RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		LogicStatement l = (LogicStatement)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		LogicStatement p = (LogicStatement)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new IFFStatement(l,p); 
              CUP$parser$result = new java_cup.runtime.Symbol(9/*IFFStatement*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // ImpliesStatement ::= LogicStatement IMPLIES LogicStatement 
            {
              LogicStatement RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		LogicStatement l = (LogicStatement)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		LogicStatement p = (LogicStatement)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new ImpliesStatement(l,p); 
              CUP$parser$result = new java_cup.runtime.Symbol(8/*ImpliesStatement*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // OrStatement ::= LogicStatement OR LogicStatement 
            {
              LogicStatement RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		LogicStatement l = (LogicStatement)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		LogicStatement p = (LogicStatement)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new OrStatement(l,p); 
              CUP$parser$result = new java_cup.runtime.Symbol(7/*OrStatement*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // AndStatement ::= LogicStatement AND LogicStatement 
            {
              LogicStatement RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		LogicStatement l = (LogicStatement)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		LogicStatement p = (LogicStatement)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new AndStatement(l,p); 
              CUP$parser$result = new java_cup.runtime.Symbol(6/*AndStatement*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // BinaryOpStatement ::= IFFStatement 
            {
              LogicStatement RESULT = null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		LogicStatement n = (LogicStatement)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		RESULT = n; 
              CUP$parser$result = new java_cup.runtime.Symbol(3/*BinaryOpStatement*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // BinaryOpStatement ::= ImpliesStatement 
            {
              LogicStatement RESULT = null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		LogicStatement n = (LogicStatement)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		RESULT = n ;
              CUP$parser$result = new java_cup.runtime.Symbol(3/*BinaryOpStatement*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // BinaryOpStatement ::= OrStatement 
            {
              LogicStatement RESULT = null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		LogicStatement n = (LogicStatement)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		RESULT = n ;
              CUP$parser$result = new java_cup.runtime.Symbol(3/*BinaryOpStatement*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // BinaryOpStatement ::= AndStatement 
            {
              LogicStatement RESULT = null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		LogicStatement n = (LogicStatement)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		RESULT = n ;
              CUP$parser$result = new java_cup.runtime.Symbol(3/*BinaryOpStatement*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // NotStatement ::= NOT LogicStatement 
            {
              LogicStatement RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		LogicStatement l = (LogicStatement)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new NotStatement(l); 
              CUP$parser$result = new java_cup.runtime.Symbol(4/*NotStatement*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // UnaryOpStatement ::= NotStatement 
            {
              LogicStatement RESULT = null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		LogicStatement n = (LogicStatement)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		RESULT = n ;
              CUP$parser$result = new java_cup.runtime.Symbol(2/*UnaryOpStatement*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Variable ::= ID 
            {
              LogicStatement RESULT = null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new Variable(i); 
              CUP$parser$result = new java_cup.runtime.Symbol(5/*Variable*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // LogicStatement ::= BinaryOpStatement 
            {
              LogicStatement RESULT = null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		LogicStatement v = (LogicStatement)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = v;
              CUP$parser$result = new java_cup.runtime.Symbol(1/*LogicStatement*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // LogicStatement ::= UnaryOpStatement 
            {
              LogicStatement RESULT = null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		LogicStatement v = (LogicStatement)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = v;
              CUP$parser$result = new java_cup.runtime.Symbol(1/*LogicStatement*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // LogicStatement ::= Variable 
            {
              LogicStatement RESULT = null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		LogicStatement v = (LogicStatement)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = v;
              CUP$parser$result = new java_cup.runtime.Symbol(1/*LogicStatement*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // LogicStatement ::= FALSITY 
            {
              LogicStatement RESULT = null;
		 RESULT = new Falsity(); 
              CUP$parser$result = new java_cup.runtime.Symbol(1/*LogicStatement*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // LogicStatement ::= TRUTH 
            {
              LogicStatement RESULT = null;
		 RESULT = new Truth(); 
              CUP$parser$result = new java_cup.runtime.Symbol(1/*LogicStatement*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= LogicStatement EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		LogicStatement start_val = (LogicStatement)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // LogicStatement ::= LBRACKET LogicStatement RBRACKET 
            {
              LogicStatement RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		LogicStatement l = (LogicStatement)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = l;
              CUP$parser$result = new java_cup.runtime.Symbol(1/*LogicStatement*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

