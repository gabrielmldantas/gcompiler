/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.gcompiler.node;

import br.com.ufs.gcompiler.analysis.*;

@SuppressWarnings("nls")
public final class AMatchedStmtStmt extends PStmt
{
    private PMatchedStmt _matchedStmt_;

    public AMatchedStmtStmt()
    {
        // Constructor
    }

    public AMatchedStmtStmt(
        @SuppressWarnings("hiding") PMatchedStmt _matchedStmt_)
    {
        // Constructor
        setMatchedStmt(_matchedStmt_);

    }

    @Override
    public Object clone()
    {
        return new AMatchedStmtStmt(
            cloneNode(this._matchedStmt_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMatchedStmtStmt(this);
    }

    public PMatchedStmt getMatchedStmt()
    {
        return this._matchedStmt_;
    }

    public void setMatchedStmt(PMatchedStmt node)
    {
        if(this._matchedStmt_ != null)
        {
            this._matchedStmt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._matchedStmt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._matchedStmt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._matchedStmt_ == child)
        {
            this._matchedStmt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._matchedStmt_ == oldChild)
        {
            setMatchedStmt((PMatchedStmt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
