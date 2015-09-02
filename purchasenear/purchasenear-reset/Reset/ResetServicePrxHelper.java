// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `ResetService.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package cn.purchasenear.service.reset.Reset;

public final class ResetServicePrxHelper extends Ice.ObjectPrxHelperBase implements ResetServicePrx
{
    private static final String __flashsales_name = "flashsales";

    public ResetInfo flashsales(long orderId, long flashSalesId)
    {
        return flashsales(orderId, flashSalesId, null, false);
    }

    public ResetInfo flashsales(long orderId, long flashSalesId, java.util.Map<String, String> __ctx)
    {
        return flashsales(orderId, flashSalesId, __ctx, true);
    }

    private ResetInfo flashsales(long orderId, long flashSalesId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "flashsales", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("flashsales");
                    __delBase = __getDelegate(false);
                    _ResetServiceDel __del = (_ResetServiceDel)__delBase;
                    return __del.flashsales(orderId, flashSalesId, __ctx, __observer);
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_flashsales(long orderId, long flashSalesId)
    {
        return begin_flashsales(orderId, flashSalesId, null, false, null);
    }

    public Ice.AsyncResult begin_flashsales(long orderId, long flashSalesId, java.util.Map<String, String> __ctx)
    {
        return begin_flashsales(orderId, flashSalesId, __ctx, true, null);
    }

    public Ice.AsyncResult begin_flashsales(long orderId, long flashSalesId, Ice.Callback __cb)
    {
        return begin_flashsales(orderId, flashSalesId, null, false, __cb);
    }

    public Ice.AsyncResult begin_flashsales(long orderId, long flashSalesId, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_flashsales(orderId, flashSalesId, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_flashsales(long orderId, long flashSalesId, Callback_ResetService_flashsales __cb)
    {
        return begin_flashsales(orderId, flashSalesId, null, false, __cb);
    }

    public Ice.AsyncResult begin_flashsales(long orderId, long flashSalesId, java.util.Map<String, String> __ctx, Callback_ResetService_flashsales __cb)
    {
        return begin_flashsales(orderId, flashSalesId, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_flashsales(long orderId, long flashSalesId, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__flashsales_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __flashsales_name, __cb);
        try
        {
            __result.__prepare(__flashsales_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeLong(orderId);
            __os.writeLong(flashSalesId);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public ResetInfo end_flashsales(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __flashsales_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            ResetInfo __ret;
            __ret = new ResetInfo();
            __ret.__read(__is);
            __result.__endReadParams();
            return __ret;
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    public static ResetServicePrx checkedCast(Ice.ObjectPrx __obj)
    {
        ResetServicePrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof ResetServicePrx)
            {
                __d = (ResetServicePrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    ResetServicePrxHelper __h = new ResetServicePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static ResetServicePrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        ResetServicePrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof ResetServicePrx)
            {
                __d = (ResetServicePrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    ResetServicePrxHelper __h = new ResetServicePrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static ResetServicePrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        ResetServicePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    ResetServicePrxHelper __h = new ResetServicePrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static ResetServicePrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        ResetServicePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    ResetServicePrxHelper __h = new ResetServicePrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static ResetServicePrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        ResetServicePrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof ResetServicePrx)
            {
                __d = (ResetServicePrx)__obj;
            }
            else
            {
                ResetServicePrxHelper __h = new ResetServicePrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static ResetServicePrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        ResetServicePrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            ResetServicePrxHelper __h = new ResetServicePrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::Reset::ResetService"
    };

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected Ice._ObjectDelM __createDelegateM()
    {
        return new _ResetServiceDelM();
    }

    protected Ice._ObjectDelD __createDelegateD()
    {
        return new _ResetServiceDelD();
    }

    public static void __write(IceInternal.BasicStream __os, ResetServicePrx v)
    {
        __os.writeProxy(v);
    }

    public static ResetServicePrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            ResetServicePrxHelper result = new ResetServicePrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}