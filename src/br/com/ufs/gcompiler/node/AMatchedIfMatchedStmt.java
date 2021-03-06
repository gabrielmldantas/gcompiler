/* This file was generated by SableCC (http://www.sablecc.org/). */

package br.com.ufs.gcompiler.node;

import br.com.ufs.gcompiler.analysis.*;

@SuppressWarnings("nls")
public final class AMatchedIfMatchedStmt extends PMatchedStmt
{
    private TIf _if_;
    private TLeftParenthesis _leftParenthesis_;
    private PExpression _expression_;
    private TRightParenthesis _rightParenthesis_;
    private PMatchedStmt _ifStmt_;
    private TElse _else_;
    private PMatchedStmt _elseStmt_;

    public AMatchedIfMatchedStmt()
    {
        // Constructor
    }

    public AMatchedIfMatchedStmt(
        @SuppressWarnings("hiding") TIf _if_,
        @SuppressWarnings("hiding") TLeftParenthesis _leftParenthesis_,
        @SuppressWarnings("hiding") PExpression _expression_,
        @SuppressWarnings("hiding") TRightParenthesis _rightParenthesis_,
        @SuppressWarnings("hiding") PMatchedStmt _ifStmt_,
        @SuppressWarnings("hiding") TElse _else_,
        @SuppressWarnings("hiding") PMatchedStmt _elseStmt_)
    {
        // Constructor
        setIf(_if_);

        setLeftParenthesis(_leftParenthesis_);

        setExpression(_expression_);

        setRightParenthesis(_rightParenthesis_);

        setIfStmt(_ifStmt_);

        setElse(_else_);

        setElseStmt(_elseStmt_);

    }

    @Override
    public Object clone()
    {
        return new AMatchedIfMatchedStmt(
            cloneNode(this._if_),
            cloneNode(this._leftParenthesis_),
            cloneNode(this._expression_),
            cloneNode(this._rightParenthesis_),
            cloneNode(this._ifStmt_),
            cloneNode(this._else_),
            cloneNode(this._elseStmt_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMatchedIfMatchedStmt(this);
    }

    public TIf getIf()
    {
        return this._if_;
    }

    public void setIf(TIf node)
    {
        if(this._if_ != null)
        {
            this._if_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._if_ = node;
    }

    public TLeftParenthesis getLeftParenthesis()
    {
        return this._leftParenthesis_;
    }

    public void setLeftParenthesis(TLeftParenthesis node)
    {
        if(this._leftParenthesis_ != null)
        {
            this._leftParenthesis_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._leftParenthesis_ = node;
    }

    public PExpression getExpression()
    {
        return this._expression_;
    }

    public void setExpression(PExpression node)
    {
        if(this._expression_ != null)
        {
            this._expression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expression_ = node;
    }

    public TRightParenthesis getRightParenthesis()
    {
        return this._rightParenthesis_;
    }

    public void setRightParenthesis(TRightParenthesis node)
    {
        if(this._rightParenthesis_ != null)
        {
            this._rightParenthesis_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rightParenthesis_ = node;
    }

    public PMatchedStmt getIfStmt()
    {
        return this._ifStmt_;
    }

    public void setIfStmt(PMatchedStmt node)
    {
        if(this._ifStmt_ != null)
        {
            this._ifStmt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ifStmt_ = node;
    }

    public TElse getElse()
    {
        return this._else_;
    }

    public void setElse(TElse node)
    {
        if(this._else_ != null)
        {
            this._else_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._else_ = node;
    }

    public PMatchedStmt getElseStmt()
    {
        return this._elseStmt_;
    }

    public void setElseStmt(PMatchedStmt node)
    {
        if(this._elseStmt_ != null)
        {
            this._elseStmt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._elseStmt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._if_)
            + toString(this._leftParenthesis_)
            + toString(this._expression_)
            + toString(this._rightParenthesis_)
            + toString(this._ifStmt_)
            + toString(this._else_)
            + toString(this._elseStmt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._if_ == child)
        {
            this._if_ = null;
            return;
        }

        if(this._leftParenthesis_ == child)
        {
            this._leftParenthesis_ = null;
            return;
        }

        if(this._expression_ == child)
        {
            this._expression_ = null;
            return;
        }

        if(this._rightParenthesis_ == child)
        {
            this._rightParenthesis_ = null;
            return;
        }

        if(this._ifStmt_ == child)
        {
            this._ifStmt_ = null;
            return;
        }

        if(this._else_ == child)
        {
            this._else_ = null;
            return;
        }

        if(this._elseStmt_ == child)
        {
            this._elseStmt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._if_ == oldChild)
        {
            setIf((TIf) newChild);
            return;
        }

        if(this._leftParenthesis_ == oldChild)
        {
            setLeftParenthesis((TLeftParenthesis) newChild);
            return;
        }

        if(this._expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        if(this._rightParenthesis_ == oldChild)
        {
            setRightParenthesis((TRightParenthesis) newChild);
            return;
        }

        if(this._ifStmt_ == oldChild)
        {
            setIfStmt((PMatchedStmt) newChild);
            return;
        }

        if(this._else_ == oldChild)
        {
            setElse((TElse) newChild);
            return;
        }

        if(this._elseStmt_ == oldChild)
        {
            setElseStmt((PMatchedStmt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
