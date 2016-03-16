/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.gcompiler.analysis;

import java.util.*;
import br.com.ufs.gcompiler.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProgram(AProgram node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclList(ADeclList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarDeclDecl(AVarDeclDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFuncDeclDecl(AFuncDeclDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleVarDecl(ASimpleVarDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrayVarDecl(AArrayVarDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFuncDecl(AFuncDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALocalDecl(ALocalDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEmptyLocalDecl(AEmptyLocalDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntTypeSpec(AIntTypeSpec node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringTypeSpec(AStringTypeSpec node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFuncReturnTypeSpec(AFuncReturnTypeSpec node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVoidFuncReturnTypeSpec(AVoidFuncReturnTypeSpec node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParamParams(AParamParams node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANoneParams(ANoneParams node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASequenceParamList(ASequenceParamList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASingleParamList(ASingleParamList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleParam(ASimpleParam node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrayParam(AArrayParam node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACompoundStmt(ACompoundStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStmtList(AStmtList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEmptyStmtList(AEmptyStmtList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMatchedStmtStmt(AMatchedStmtStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnmatchedStmtStmt(AUnmatchedStmtStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMatchedIfMatchedStmt(AMatchedIfMatchedStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOtherStmtMatchedStmt(AOtherStmtMatchedStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnmatchedIfUnmatchedStmt(AUnmatchedIfUnmatchedStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnmatchedIfElseUnmatchedStmt(AUnmatchedIfElseUnmatchedStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpressionStmtOtherStmt(AExpressionStmtOtherStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACompoundStmtOtherStmt(ACompoundStmtOtherStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIterationStmtOtherStmt(AIterationStmtOtherStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAReturnStmtOtherStmt(AReturnStmtOtherStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpressionStmt(AExpressionStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEmptyExpressionStmt(AEmptyExpressionStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIterationStmt(AIterationStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVoidReturnStmt(AVoidReturnStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpressionReturnStmt(AExpressionReturnStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleVar(ASimpleVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrayVar(AArrayVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAssignExpressionExpression(AAssignExpressionExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleExpressionExpression(ASimpleExpressionExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARelopExpressionSimpleExpression(ARelopExpressionSimpleExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAdditiveExpressionSimpleExpression(AAdditiveExpressionSimpleExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALessThanOrEqRelop(ALessThanOrEqRelop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALessThanRelop(ALessThanRelop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGreaterThanRelop(AGreaterThanRelop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGreaterThanOrEqRelop(AGreaterThanOrEqRelop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEqualsRelop(AEqualsRelop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANotEqualsRelop(ANotEqualsRelop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAdditiveExpressionAdditiveExpression(AAdditiveExpressionAdditiveExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermAdditiveExpression(ATermAdditiveExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPlusAddop(APlusAddop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMinusAddop(AMinusAddop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermTerm(ATermTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFactorTerm(AFactorTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiplicationMulop(AMultiplicationMulop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivisionMulop(ADivisionMulop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFactorFactor(AFactorFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarFactor(AVarFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumFactor(ANumFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringFactor(AStringFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACallFactor(ACallFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACall(ACall node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASequenceArgList(ASequenceArgList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASingleArgList(ASingleArgList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEmptyArgList(AEmptyArgList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInt(TInt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVoid(TVoid node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIf(TIf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTElse(TElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReturn(TReturn node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWhile(TWhile node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNum(TNum node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStringLiteral(TStringLiteral node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDivision(TDivision node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMultiplication(TMultiplication node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLessThan(TLessThan node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLessThanOrEq(TLessThanOrEq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGreaterThan(TGreaterThan node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGreaterThanOrEq(TGreaterThanOrEq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEquals(TEquals node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNotEquals(TNotEquals node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAssign(TAssign node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSemi(TSemi node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeftParenthesis(TLeftParenthesis node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRightParenthesis(TRightParenthesis node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeftBracket(TLeftBracket node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRightBracket(TRightBracket node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeftBrace(TLeftBrace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRightBrace(TRightBrace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLineComment(TLineComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlkComment(TBlkComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlkCommentEnd(TBlkCommentEnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlkCommentBody(TBlkCommentBody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStar(TStar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSlash(TSlash node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
