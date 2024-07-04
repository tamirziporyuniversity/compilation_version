package AST;

public class AST_STMT_CALL_FUNC extends AST_STMT
{
    public AST_CALL_FUNC callFunc;

    /******************/
    /* CONSTRUCTOR(S) */
    /******************/
    public AST_STMT_CALL_FUNC(AST_CALL_FUNC callFunc)
    {
        /******************************/
        /* SET A UNIQUE SERIAL NUMBER */
        /******************************/
        SerialNumber = AST_Node_Serial_Number.getFresh();

        /***************************************/
        /* PRINT CORRESPONDING DERIVATION RULE */
        /***************************************/
        System.out.println("====================== stmt -> callFunc SEMICOLON");

        /*******************************/
        /* COPY INPUT DATA MEMBERS ... */
        /*******************************/
        this.callFunc = callFunc;
    }

    /***************************************************/
    /* The printing message for a function call statement AST node */
    /***************************************************/
    public void PrintMe()
    {
        /*********************************/
        /* AST NODE TYPE = FUNCTION CALL STATEMENT */
        /*********************************/
        System.out.println("AST NODE FUNCTION CALL STATEMENT");

        /******************************************/
        /* RECURSIVELY PRINT callFunc ... */
        /******************************************/
        if (callFunc != null) callFunc.PrintMe();

        /***************************************/
        /* PRINT Node to AST GRAPHVIZ DOT file */
        /***************************************/
        AST_GRAPHVIZ.getInstance().logNode(
            SerialNumber,
            "FUNCTION CALL STATEMENT");

        /****************************************/
        /* PRINT Edges to AST GRAPHVIZ DOT file */
        /****************************************/
        if (callFunc != null) AST_GRAPHVIZ.getInstance().logEdge(SerialNumber, callFunc.SerialNumber);
    }
}
