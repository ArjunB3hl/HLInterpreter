/* Generated By:JJTree: Do not edit this line. ASTinterval.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTinterval extends SimpleNode {
  public ASTinterval(int id) {
    super(id);
  }

  public ASTinterval(HL p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(HLVisitor visitor, Object data) throws Exception {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=04c6a37a062070e7554c9ce2ec2a3f04 (do not edit this line) */
