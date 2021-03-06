/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.gcompiler.node;

import br.com.ufs.gcompiler.analysis.*;

@SuppressWarnings("nls")
public final class AUnmatchedStmtStmt extends PStmt
{
    private PUnmatchedStmt _unmatchedStmt_;

    public AUnmatchedStmtStmt()
    {
        // Constructor
    }

    public AUnmatchedStmtStmt(
        @SuppressWarnings("hiding") PUnmatchedStmt _unmatchedStmt_)
    {
        // Constructor
        setUnmatchedStmt(_unmatchedStmt_);

    }

    @Override
    public Object clone()
    {
        return new AUnmatchedStmtStmt(
            cloneNode(this._unmatchedStmt_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUnmatchedStmtStmt(this);
    }

    public PUnmatchedStmt getUnmatchedStmt()
    {
        return this._unmatchedStmt_;
    }

    public void setUnmatchedStmt(PUnmatchedStmt node)
    {
        if(this._unmatchedStmt_ != null)
        {
            this._unmatchedStmt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._unmatchedStmt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._unmatchedStmt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._unmatchedStmt_ == child)
        {
            this._unmatchedStmt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._unmatchedStmt_ == oldChild)
        {
            setUnmatchedStmt((PUnmatchedStmt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
