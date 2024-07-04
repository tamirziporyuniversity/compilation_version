package AST;

public class AST_NEW_EXP_TYPE extends AST_NEW_EXP
{
    public AST_TYPE type;

    /******************/
    /* CONSTRUCTOR(S) */
    /******************/
    public AST_NEW_EXP_TYPE(AST_TYPE type)
    {
        /******************************/
        /* SET A UNIQUE SERIAL NUMBER */
        /******************************/
        SerialNumber = AST_Node_Serial_Number.getFresh();

        /***************************************/
        /* PRINT CORRESPONDING DERIVATION RULE */
        /***************************************/
        System.out.println("====================== newExp -> NEW type");

        /*******************************/
        /* COPY INPUT DATA MEMBERS ... */
        /*******************************/
        this.type = type;
    }

    /***************************************************/
    /* The printing message for a new expression with type AST node */
    /***************************************************/
    public void PrintMe()
    {
        /*********************************/
        /* AST NODE TYPE = NEW EXPRESSION WITH TYPE */
        /*********************************/
        System.out.println("AST NODE NEW EXPRESSION WITH TYPE");

        /******************************************/
        /* RECURSIVELY PRINT type ... */
        /******************************************/
        if (type != null) type.PrintMe();

        /***************************************/
        /* PRINT Node to AST GRAPHVIZ DOT file */
        /***************************************/
        AST_GRAPHVIZ.getInstance().logNode(
            SerialNumber,
            "NEW EXPRESSION\nWITH TYPE");

        /****************************************/
        /* PRINT Edges to AST GRAPHVIZ DOT file */
        /****************************************/
        if (type != null) AST_GRAPHVIZ.getInstance().logEdge(SerialNumber, type.SerialNumber);
    }
}
