package AST;

public class AST_NEW_EXP_TYPE_EXP extends AST_NEW_EXP
{
    public AST_TYPE type;
    public AST_EXP exp;

    /******************/
    /* CONSTRUCTOR(S) */
    /******************/
    public AST_NEW_EXP_TYPE_EXP(AST_TYPE type, AST_EXP exp)
    {
        /******************************/
        /* SET A UNIQUE SERIAL NUMBER */
        /******************************/
        SerialNumber = AST_Node_Serial_Number.getFresh();

        /***************************************/
        /* PRINT CORRESPONDING DERIVATION RULE */
        /***************************************/
        System.out.println("====================== newExp -> NEW type [exp]");

        /*******************************/
        /* COPY INPUT DATA MEMBERS ... */
        /*******************************/
        this.type = type;
        this.exp = exp;
    }

    /***************************************************/
    /* The printing message for a new expression with type and expression AST node */
    /***************************************************/
    public void PrintMe()
    {
        /*********************************/
        /* AST NODE TYPE = NEW EXPRESSION WITH TYPE AND EXPRESSION */
        /*********************************/
        System.out.println("AST NODE NEW EXPRESSION WITH TYPE AND EXPRESSION");

        /******************************************/
        /* RECURSIVELY PRINT type and exp ... */
        /******************************************/
        if (type != null) type.PrintMe();
        if (exp != null) exp.PrintMe();

        /***************************************/
        /* PRINT Node to AST GRAPHVIZ DOT file */
        /***************************************/
        AST_GRAPHVIZ.getInstance().logNode(
            SerialNumber,
            "NEW EXPRESSION\nWITH TYPE AND EXPRESSION");

        /****************************************/
        /* PRINT Edges to AST GRAPHVIZ DOT file */
        /****************************************/
        if (type != null) AST_GRAPHVIZ.getInstance().logEdge(SerialNumber, type.SerialNumber);
        if (exp != null) AST_GRAPHVIZ.getInstance().logEdge(SerialNumber, exp.SerialNumber);
    }
}
