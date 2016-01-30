/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.gcompiler.analysis;

import br.com.ufs.gcompiler.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseTType(TType node);
    void caseTVoid(TVoid node);
    void caseTIf(TIf node);
    void caseTElse(TElse node);
    void caseTReturn(TReturn node);
    void caseTWhile(TWhile node);
    void caseTNum(TNum node);
    void caseTId(TId node);
    void caseTBlank(TBlank node);
    void caseTComment(TComment node);
    void caseTStringLiteral(TStringLiteral node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTDivision(TDivision node);
    void caseTMultiplication(TMultiplication node);
    void caseTLessThan(TLessThan node);
    void caseTLessThanOrEq(TLessThanOrEq node);
    void caseTGreaterThan(TGreaterThan node);
    void caseTGreatherThanOrEq(TGreatherThanOrEq node);
    void caseTEquals(TEquals node);
    void caseTNotEquals(TNotEquals node);
    void caseTAssign(TAssign node);
    void caseTSemi(TSemi node);
    void caseTComma(TComma node);
    void caseTLeftParenthesis(TLeftParenthesis node);
    void caseTRightParenthesis(TRightParenthesis node);
    void caseTLeftBracket(TLeftBracket node);
    void caseTRightBracket(TRightBracket node);
    void caseTLeftBrace(TLeftBrace node);
    void caseTRightBrace(TRightBrace node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
