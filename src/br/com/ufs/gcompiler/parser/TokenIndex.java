/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.gcompiler.parser;

import br.com.ufs.gcompiler.node.*;
import br.com.ufs.gcompiler.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTInt(@SuppressWarnings("unused") TInt node)
    {
        this.index = 0;
    }

    @Override
    public void caseTString(@SuppressWarnings("unused") TString node)
    {
        this.index = 1;
    }

    @Override
    public void caseTVoid(@SuppressWarnings("unused") TVoid node)
    {
        this.index = 2;
    }

    @Override
    public void caseTIf(@SuppressWarnings("unused") TIf node)
    {
        this.index = 3;
    }

    @Override
    public void caseTElse(@SuppressWarnings("unused") TElse node)
    {
        this.index = 4;
    }

    @Override
    public void caseTReturn(@SuppressWarnings("unused") TReturn node)
    {
        this.index = 5;
    }

    @Override
    public void caseTWhile(@SuppressWarnings("unused") TWhile node)
    {
        this.index = 6;
    }

    @Override
    public void caseTNum(@SuppressWarnings("unused") TNum node)
    {
        this.index = 7;
    }

    @Override
    public void caseTId(@SuppressWarnings("unused") TId node)
    {
        this.index = 8;
    }

    @Override
    public void caseTStringLiteral(@SuppressWarnings("unused") TStringLiteral node)
    {
        this.index = 9;
    }

    @Override
    public void caseTPlus(@SuppressWarnings("unused") TPlus node)
    {
        this.index = 10;
    }

    @Override
    public void caseTMinus(@SuppressWarnings("unused") TMinus node)
    {
        this.index = 11;
    }

    @Override
    public void caseTDivision(@SuppressWarnings("unused") TDivision node)
    {
        this.index = 12;
    }

    @Override
    public void caseTMultiplication(@SuppressWarnings("unused") TMultiplication node)
    {
        this.index = 13;
    }

    @Override
    public void caseTLessThan(@SuppressWarnings("unused") TLessThan node)
    {
        this.index = 14;
    }

    @Override
    public void caseTLessThanOrEq(@SuppressWarnings("unused") TLessThanOrEq node)
    {
        this.index = 15;
    }

    @Override
    public void caseTGreaterThan(@SuppressWarnings("unused") TGreaterThan node)
    {
        this.index = 16;
    }

    @Override
    public void caseTGreaterThanOrEq(@SuppressWarnings("unused") TGreaterThanOrEq node)
    {
        this.index = 17;
    }

    @Override
    public void caseTEquals(@SuppressWarnings("unused") TEquals node)
    {
        this.index = 18;
    }

    @Override
    public void caseTNotEquals(@SuppressWarnings("unused") TNotEquals node)
    {
        this.index = 19;
    }

    @Override
    public void caseTAssign(@SuppressWarnings("unused") TAssign node)
    {
        this.index = 20;
    }

    @Override
    public void caseTSemi(@SuppressWarnings("unused") TSemi node)
    {
        this.index = 21;
    }

    @Override
    public void caseTComma(@SuppressWarnings("unused") TComma node)
    {
        this.index = 22;
    }

    @Override
    public void caseTLeftParenthesis(@SuppressWarnings("unused") TLeftParenthesis node)
    {
        this.index = 23;
    }

    @Override
    public void caseTRightParenthesis(@SuppressWarnings("unused") TRightParenthesis node)
    {
        this.index = 24;
    }

    @Override
    public void caseTLeftBracket(@SuppressWarnings("unused") TLeftBracket node)
    {
        this.index = 25;
    }

    @Override
    public void caseTRightBracket(@SuppressWarnings("unused") TRightBracket node)
    {
        this.index = 26;
    }

    @Override
    public void caseTLeftBrace(@SuppressWarnings("unused") TLeftBrace node)
    {
        this.index = 27;
    }

    @Override
    public void caseTRightBrace(@SuppressWarnings("unused") TRightBrace node)
    {
        this.index = 28;
    }

    @Override
    public void caseTBlkComment(@SuppressWarnings("unused") TBlkComment node)
    {
        this.index = 29;
    }

    @Override
    public void caseTBlkCommentEnd(@SuppressWarnings("unused") TBlkCommentEnd node)
    {
        this.index = 30;
    }

    @Override
    public void caseTBlkCommentBody(@SuppressWarnings("unused") TBlkCommentBody node)
    {
        this.index = 31;
    }

    @Override
    public void caseTStar(@SuppressWarnings("unused") TStar node)
    {
        this.index = 32;
    }

    @Override
    public void caseTSlash(@SuppressWarnings("unused") TSlash node)
    {
        this.index = 33;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 34;
    }
}
