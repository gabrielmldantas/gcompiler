/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.gcompiler.analysis;

import java.util.*;
import br.com.ufs.gcompiler.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPProgram().apply(this);
        outStart(node);
    }

    public void inAProgram(AProgram node)
    {
        defaultIn(node);
    }

    public void outAProgram(AProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProgram(AProgram node)
    {
        inAProgram(node);
        if(node.getDeclList() != null)
        {
            node.getDeclList().apply(this);
        }
        outAProgram(node);
    }

    public void inADeclList(ADeclList node)
    {
        defaultIn(node);
    }

    public void outADeclList(ADeclList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclList(ADeclList node)
    {
        inADeclList(node);
        {
            List<PDecl> copy = new ArrayList<PDecl>(node.getDecl());
            Collections.reverse(copy);
            for(PDecl e : copy)
            {
                e.apply(this);
            }
        }
        outADeclList(node);
    }

    public void inAVarDeclDecl(AVarDeclDecl node)
    {
        defaultIn(node);
    }

    public void outAVarDeclDecl(AVarDeclDecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarDeclDecl(AVarDeclDecl node)
    {
        inAVarDeclDecl(node);
        if(node.getVarDecl() != null)
        {
            node.getVarDecl().apply(this);
        }
        outAVarDeclDecl(node);
    }

    public void inAFuncDeclDecl(AFuncDeclDecl node)
    {
        defaultIn(node);
    }

    public void outAFuncDeclDecl(AFuncDeclDecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFuncDeclDecl(AFuncDeclDecl node)
    {
        inAFuncDeclDecl(node);
        if(node.getFuncDecl() != null)
        {
            node.getFuncDecl().apply(this);
        }
        outAFuncDeclDecl(node);
    }

    public void inAVarDecl(AVarDecl node)
    {
        defaultIn(node);
    }

    public void outAVarDecl(AVarDecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarDecl(AVarDecl node)
    {
        inAVarDecl(node);
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getTypeSpec() != null)
        {
            node.getTypeSpec().apply(this);
        }
        outAVarDecl(node);
    }

    public void inAFuncDecl(AFuncDecl node)
    {
        defaultIn(node);
    }

    public void outAFuncDecl(AFuncDecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFuncDecl(AFuncDecl node)
    {
        inAFuncDecl(node);
        if(node.getCompoundStmt() != null)
        {
            node.getCompoundStmt().apply(this);
        }
        if(node.getRightParenthesis() != null)
        {
            node.getRightParenthesis().apply(this);
        }
        if(node.getParams() != null)
        {
            node.getParams().apply(this);
        }
        if(node.getLeftParenthesis() != null)
        {
            node.getLeftParenthesis().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getTypeSpec() != null)
        {
            node.getTypeSpec().apply(this);
        }
        outAFuncDecl(node);
    }

    public void inAIntTypeSpec(AIntTypeSpec node)
    {
        defaultIn(node);
    }

    public void outAIntTypeSpec(AIntTypeSpec node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntTypeSpec(AIntTypeSpec node)
    {
        inAIntTypeSpec(node);
        if(node.getInt() != null)
        {
            node.getInt().apply(this);
        }
        outAIntTypeSpec(node);
    }

    public void inAVoidTypeSpec(AVoidTypeSpec node)
    {
        defaultIn(node);
    }

    public void outAVoidTypeSpec(AVoidTypeSpec node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVoidTypeSpec(AVoidTypeSpec node)
    {
        inAVoidTypeSpec(node);
        if(node.getVoid() != null)
        {
            node.getVoid().apply(this);
        }
        outAVoidTypeSpec(node);
    }

    public void inAStringTypeSpec(AStringTypeSpec node)
    {
        defaultIn(node);
    }

    public void outAStringTypeSpec(AStringTypeSpec node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringTypeSpec(AStringTypeSpec node)
    {
        inAStringTypeSpec(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringTypeSpec(node);
    }

    public void inAParamParams(AParamParams node)
    {
        defaultIn(node);
    }

    public void outAParamParams(AParamParams node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParamParams(AParamParams node)
    {
        inAParamParams(node);
        {
            List<PParamList> copy = new ArrayList<PParamList>(node.getParamList());
            Collections.reverse(copy);
            for(PParamList e : copy)
            {
                e.apply(this);
            }
        }
        outAParamParams(node);
    }

    public void inANoneParams(ANoneParams node)
    {
        defaultIn(node);
    }

    public void outANoneParams(ANoneParams node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANoneParams(ANoneParams node)
    {
        inANoneParams(node);
        if(node.getVoid() != null)
        {
            node.getVoid().apply(this);
        }
        outANoneParams(node);
    }

    public void inASequenceParamList(ASequenceParamList node)
    {
        defaultIn(node);
    }

    public void outASequenceParamList(ASequenceParamList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASequenceParamList(ASequenceParamList node)
    {
        inASequenceParamList(node);
        if(node.getParam() != null)
        {
            node.getParam().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getParamList() != null)
        {
            node.getParamList().apply(this);
        }
        outASequenceParamList(node);
    }

    public void inASingleParamList(ASingleParamList node)
    {
        defaultIn(node);
    }

    public void outASingleParamList(ASingleParamList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASingleParamList(ASingleParamList node)
    {
        inASingleParamList(node);
        if(node.getParam() != null)
        {
            node.getParam().apply(this);
        }
        outASingleParamList(node);
    }

    public void inAParam(AParam node)
    {
        defaultIn(node);
    }

    public void outAParam(AParam node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParam(AParam node)
    {
        inAParam(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getTypeSpec() != null)
        {
            node.getTypeSpec().apply(this);
        }
        outAParam(node);
    }

    public void inACompoundStmt(ACompoundStmt node)
    {
        defaultIn(node);
    }

    public void outACompoundStmt(ACompoundStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACompoundStmt(ACompoundStmt node)
    {
        inACompoundStmt(node);
        if(node.getRightBrace() != null)
        {
            node.getRightBrace().apply(this);
        }
        {
            List<PStmt> copy = new ArrayList<PStmt>(node.getStmt());
            Collections.reverse(copy);
            for(PStmt e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PVarDecl> copy = new ArrayList<PVarDecl>(node.getVarDecl());
            Collections.reverse(copy);
            for(PVarDecl e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getLeftBrace() != null)
        {
            node.getLeftBrace().apply(this);
        }
        outACompoundStmt(node);
    }

    public void inAExpressionStmtStmt(AExpressionStmtStmt node)
    {
        defaultIn(node);
    }

    public void outAExpressionStmtStmt(AExpressionStmtStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpressionStmtStmt(AExpressionStmtStmt node)
    {
        inAExpressionStmtStmt(node);
        if(node.getExpressionStmt() != null)
        {
            node.getExpressionStmt().apply(this);
        }
        outAExpressionStmtStmt(node);
    }

    public void inACompoundStmtStmt(ACompoundStmtStmt node)
    {
        defaultIn(node);
    }

    public void outACompoundStmtStmt(ACompoundStmtStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACompoundStmtStmt(ACompoundStmtStmt node)
    {
        inACompoundStmtStmt(node);
        if(node.getCompoundStmt() != null)
        {
            node.getCompoundStmt().apply(this);
        }
        outACompoundStmtStmt(node);
    }

    public void inAExpressionStmt(AExpressionStmt node)
    {
        defaultIn(node);
    }

    public void outAExpressionStmt(AExpressionStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpressionStmt(AExpressionStmt node)
    {
        inAExpressionStmt(node);
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAExpressionStmt(node);
    }

    public void inAAssignExpressionExpression(AAssignExpressionExpression node)
    {
        defaultIn(node);
    }

    public void outAAssignExpressionExpression(AAssignExpressionExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAssignExpressionExpression(AAssignExpressionExpression node)
    {
        inAAssignExpressionExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getAssign() != null)
        {
            node.getAssign().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAAssignExpressionExpression(node);
    }

    public void inASimpleExpressionExpression(ASimpleExpressionExpression node)
    {
        defaultIn(node);
    }

    public void outASimpleExpressionExpression(ASimpleExpressionExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleExpressionExpression(ASimpleExpressionExpression node)
    {
        inASimpleExpressionExpression(node);
        if(node.getSimpleExpression() != null)
        {
            node.getSimpleExpression().apply(this);
        }
        outASimpleExpressionExpression(node);
    }

    public void inAVar(AVar node)
    {
        defaultIn(node);
    }

    public void outAVar(AVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVar(AVar node)
    {
        inAVar(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAVar(node);
    }

    public void inARelopExpressionSimpleExpression(ARelopExpressionSimpleExpression node)
    {
        defaultIn(node);
    }

    public void outARelopExpressionSimpleExpression(ARelopExpressionSimpleExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARelopExpressionSimpleExpression(ARelopExpressionSimpleExpression node)
    {
        inARelopExpressionSimpleExpression(node);
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        if(node.getRelop() != null)
        {
            node.getRelop().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        outARelopExpressionSimpleExpression(node);
    }

    public void inAAdditiveExpressionSimpleExpression(AAdditiveExpressionSimpleExpression node)
    {
        defaultIn(node);
    }

    public void outAAdditiveExpressionSimpleExpression(AAdditiveExpressionSimpleExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAdditiveExpressionSimpleExpression(AAdditiveExpressionSimpleExpression node)
    {
        inAAdditiveExpressionSimpleExpression(node);
        if(node.getAdditiveExpression() != null)
        {
            node.getAdditiveExpression().apply(this);
        }
        outAAdditiveExpressionSimpleExpression(node);
    }

    public void inALessThanOrEqRelop(ALessThanOrEqRelop node)
    {
        defaultIn(node);
    }

    public void outALessThanOrEqRelop(ALessThanOrEqRelop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALessThanOrEqRelop(ALessThanOrEqRelop node)
    {
        inALessThanOrEqRelop(node);
        if(node.getLessThanOrEq() != null)
        {
            node.getLessThanOrEq().apply(this);
        }
        outALessThanOrEqRelop(node);
    }

    public void inALessThanRelop(ALessThanRelop node)
    {
        defaultIn(node);
    }

    public void outALessThanRelop(ALessThanRelop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALessThanRelop(ALessThanRelop node)
    {
        inALessThanRelop(node);
        if(node.getLessThan() != null)
        {
            node.getLessThan().apply(this);
        }
        outALessThanRelop(node);
    }

    public void inAGreaterThanRelop(AGreaterThanRelop node)
    {
        defaultIn(node);
    }

    public void outAGreaterThanRelop(AGreaterThanRelop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGreaterThanRelop(AGreaterThanRelop node)
    {
        inAGreaterThanRelop(node);
        if(node.getGreaterThan() != null)
        {
            node.getGreaterThan().apply(this);
        }
        outAGreaterThanRelop(node);
    }

    public void inAGreaterThanOrEqRelop(AGreaterThanOrEqRelop node)
    {
        defaultIn(node);
    }

    public void outAGreaterThanOrEqRelop(AGreaterThanOrEqRelop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGreaterThanOrEqRelop(AGreaterThanOrEqRelop node)
    {
        inAGreaterThanOrEqRelop(node);
        if(node.getGreaterThanOrEq() != null)
        {
            node.getGreaterThanOrEq().apply(this);
        }
        outAGreaterThanOrEqRelop(node);
    }

    public void inAEqualsRelop(AEqualsRelop node)
    {
        defaultIn(node);
    }

    public void outAEqualsRelop(AEqualsRelop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEqualsRelop(AEqualsRelop node)
    {
        inAEqualsRelop(node);
        if(node.getEquals() != null)
        {
            node.getEquals().apply(this);
        }
        outAEqualsRelop(node);
    }

    public void inANotEqualsRelop(ANotEqualsRelop node)
    {
        defaultIn(node);
    }

    public void outANotEqualsRelop(ANotEqualsRelop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANotEqualsRelop(ANotEqualsRelop node)
    {
        inANotEqualsRelop(node);
        if(node.getNotEquals() != null)
        {
            node.getNotEquals().apply(this);
        }
        outANotEqualsRelop(node);
    }

    public void inAAdditiveExpressionAdditiveExpression(AAdditiveExpressionAdditiveExpression node)
    {
        defaultIn(node);
    }

    public void outAAdditiveExpressionAdditiveExpression(AAdditiveExpressionAdditiveExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAdditiveExpressionAdditiveExpression(AAdditiveExpressionAdditiveExpression node)
    {
        inAAdditiveExpressionAdditiveExpression(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getAddop() != null)
        {
            node.getAddop().apply(this);
        }
        if(node.getAdditiveExpression() != null)
        {
            node.getAdditiveExpression().apply(this);
        }
        outAAdditiveExpressionAdditiveExpression(node);
    }

    public void inATermAdditiveExpression(ATermAdditiveExpression node)
    {
        defaultIn(node);
    }

    public void outATermAdditiveExpression(ATermAdditiveExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATermAdditiveExpression(ATermAdditiveExpression node)
    {
        inATermAdditiveExpression(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outATermAdditiveExpression(node);
    }

    public void inAPlusAddop(APlusAddop node)
    {
        defaultIn(node);
    }

    public void outAPlusAddop(APlusAddop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusAddop(APlusAddop node)
    {
        inAPlusAddop(node);
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        outAPlusAddop(node);
    }

    public void inAMinusAddop(AMinusAddop node)
    {
        defaultIn(node);
    }

    public void outAMinusAddop(AMinusAddop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusAddop(AMinusAddop node)
    {
        inAMinusAddop(node);
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        outAMinusAddop(node);
    }

    public void inATermTerm(ATermTerm node)
    {
        defaultIn(node);
    }

    public void outATermTerm(ATermTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATermTerm(ATermTerm node)
    {
        inATermTerm(node);
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        if(node.getMulop() != null)
        {
            node.getMulop().apply(this);
        }
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outATermTerm(node);
    }

    public void inAFactorTerm(AFactorTerm node)
    {
        defaultIn(node);
    }

    public void outAFactorTerm(AFactorTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFactorTerm(AFactorTerm node)
    {
        inAFactorTerm(node);
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        outAFactorTerm(node);
    }

    public void inAMultiplicationMulop(AMultiplicationMulop node)
    {
        defaultIn(node);
    }

    public void outAMultiplicationMulop(AMultiplicationMulop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultiplicationMulop(AMultiplicationMulop node)
    {
        inAMultiplicationMulop(node);
        if(node.getMultiplication() != null)
        {
            node.getMultiplication().apply(this);
        }
        outAMultiplicationMulop(node);
    }

    public void inADivisionMulop(ADivisionMulop node)
    {
        defaultIn(node);
    }

    public void outADivisionMulop(ADivisionMulop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivisionMulop(ADivisionMulop node)
    {
        inADivisionMulop(node);
        if(node.getDivision() != null)
        {
            node.getDivision().apply(this);
        }
        outADivisionMulop(node);
    }

    public void inAFactorFactor(AFactorFactor node)
    {
        defaultIn(node);
    }

    public void outAFactorFactor(AFactorFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFactorFactor(AFactorFactor node)
    {
        inAFactorFactor(node);
        if(node.getRightParenthesis() != null)
        {
            node.getRightParenthesis().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getLeftParenthesis() != null)
        {
            node.getLeftParenthesis().apply(this);
        }
        outAFactorFactor(node);
    }

    public void inANumFactor(ANumFactor node)
    {
        defaultIn(node);
    }

    public void outANumFactor(ANumFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumFactor(ANumFactor node)
    {
        inANumFactor(node);
        if(node.getNum() != null)
        {
            node.getNum().apply(this);
        }
        outANumFactor(node);
    }

    public void inAStringFactor(AStringFactor node)
    {
        defaultIn(node);
    }

    public void outAStringFactor(AStringFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringFactor(AStringFactor node)
    {
        inAStringFactor(node);
        if(node.getStringLiteral() != null)
        {
            node.getStringLiteral().apply(this);
        }
        outAStringFactor(node);
    }

    public void inACall(ACall node)
    {
        defaultIn(node);
    }

    public void outACall(ACall node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACall(ACall node)
    {
        inACall(node);
        if(node.getRightParenthesis() != null)
        {
            node.getRightParenthesis().apply(this);
        }
        if(node.getArgs() != null)
        {
            node.getArgs().apply(this);
        }
        if(node.getLeftParenthesis() != null)
        {
            node.getLeftParenthesis().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outACall(node);
    }

    public void inAArgs(AArgs node)
    {
        defaultIn(node);
    }

    public void outAArgs(AArgs node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArgs(AArgs node)
    {
        inAArgs(node);
        {
            List<PArgList> copy = new ArrayList<PArgList>(node.getArgList());
            Collections.reverse(copy);
            for(PArgList e : copy)
            {
                e.apply(this);
            }
        }
        outAArgs(node);
    }

    public void inASequenceArgList(ASequenceArgList node)
    {
        defaultIn(node);
    }

    public void outASequenceArgList(ASequenceArgList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASequenceArgList(ASequenceArgList node)
    {
        inASequenceArgList(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getArgList() != null)
        {
            node.getArgList().apply(this);
        }
        outASequenceArgList(node);
    }

    public void inASingleArgList(ASingleArgList node)
    {
        defaultIn(node);
    }

    public void outASingleArgList(ASingleArgList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASingleArgList(ASingleArgList node)
    {
        inASingleArgList(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outASingleArgList(node);
    }
}
