//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.07.10 at 05:31:30 PM PDT 
//


package com.google.checkout.schema._2.impl;

public class OrderStateChangeNotificationImpl implements com.google.checkout.schema._2.OrderStateChangeNotification, com.sun.xml.bind.JAXBObject, com.google.checkout.schema._2.impl.runtime.UnmarshallableObject, com.google.checkout.schema._2.impl.runtime.XMLSerializable, com.google.checkout.schema._2.impl.runtime.ValidatableObject
{

    protected java.lang.String _SerialNumber;
    protected java.lang.String _GoogleOrderNumber;
    protected java.util.Calendar _Timestamp;
    protected java.lang.String _PreviousFulfillmentOrderState;
    protected java.lang.String _NewFulfillmentOrderState;
    protected java.lang.String _Reason;
    protected java.lang.String _PreviousFinancialOrderState;
    protected java.lang.String _NewFinancialOrderState;
    public final static java.lang.Class version = (com.google.checkout.schema._2.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.google.checkout.schema._2.OrderStateChangeNotification.class);
    }

    public java.lang.String getSerialNumber() {
        return _SerialNumber;
    }

    public void setSerialNumber(java.lang.String value) {
        _SerialNumber = value;
    }

    public java.lang.String getGoogleOrderNumber() {
        return _GoogleOrderNumber;
    }

    public void setGoogleOrderNumber(java.lang.String value) {
        _GoogleOrderNumber = value;
    }

    public java.util.Calendar getTimestamp() {
        return _Timestamp;
    }

    public void setTimestamp(java.util.Calendar value) {
        _Timestamp = value;
    }

    public java.lang.String getPreviousFulfillmentOrderState() {
        return _PreviousFulfillmentOrderState;
    }

    public void setPreviousFulfillmentOrderState(java.lang.String value) {
        _PreviousFulfillmentOrderState = value;
    }

    public java.lang.String getNewFulfillmentOrderState() {
        return _NewFulfillmentOrderState;
    }

    public void setNewFulfillmentOrderState(java.lang.String value) {
        _NewFulfillmentOrderState = value;
    }

    public java.lang.String getReason() {
        return _Reason;
    }

    public void setReason(java.lang.String value) {
        _Reason = value;
    }

    public java.lang.String getPreviousFinancialOrderState() {
        return _PreviousFinancialOrderState;
    }

    public void setPreviousFinancialOrderState(java.lang.String value) {
        _PreviousFinancialOrderState = value;
    }

    public java.lang.String getNewFinancialOrderState() {
        return _NewFinancialOrderState;
    }

    public void setNewFinancialOrderState(java.lang.String value) {
        _NewFinancialOrderState = value;
    }

    public com.google.checkout.schema._2.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.google.checkout.schema._2.impl.runtime.UnmarshallingContext context) {
        return new com.google.checkout.schema._2.impl.OrderStateChangeNotificationImpl.Unmarshaller(context);
    }

    public void serializeBody(com.google.checkout.schema._2.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://checkout.google.com/schema/2", "google-order-number");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(((java.lang.String) _GoogleOrderNumber), "GoogleOrderNumber");
        } catch (java.lang.Exception e) {
            com.google.checkout.schema._2.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
        context.startElement("http://checkout.google.com/schema/2", "new-financial-order-state");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(((java.lang.String) _NewFinancialOrderState), "NewFinancialOrderState");
        } catch (java.lang.Exception e) {
            com.google.checkout.schema._2.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
        context.startElement("http://checkout.google.com/schema/2", "new-fulfillment-order-state");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(((java.lang.String) _NewFulfillmentOrderState), "NewFulfillmentOrderState");
        } catch (java.lang.Exception e) {
            com.google.checkout.schema._2.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
        context.startElement("http://checkout.google.com/schema/2", "previous-financial-order-state");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(((java.lang.String) _PreviousFinancialOrderState), "PreviousFinancialOrderState");
        } catch (java.lang.Exception e) {
            com.google.checkout.schema._2.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
        context.startElement("http://checkout.google.com/schema/2", "previous-fulfillment-order-state");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(((java.lang.String) _PreviousFulfillmentOrderState), "PreviousFulfillmentOrderState");
        } catch (java.lang.Exception e) {
            com.google.checkout.schema._2.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
        if (_Reason!= null) {
            context.startElement("http://checkout.google.com/schema/2", "reason");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(((java.lang.String) _Reason), "Reason");
            } catch (java.lang.Exception e) {
                com.google.checkout.schema._2.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        context.startElement("http://checkout.google.com/schema/2", "timestamp");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(com.sun.msv.datatype.xsd.DateTimeType.theInstance.serializeJavaObject(((java.util.Calendar) _Timestamp), null), "Timestamp");
        } catch (java.lang.Exception e) {
            com.google.checkout.schema._2.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
    }

    public void serializeAttributes(com.google.checkout.schema._2.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startAttribute("", "serial-number");
        try {
            context.text(((java.lang.String) _SerialNumber), "SerialNumber");
        } catch (java.lang.Exception e) {
            com.google.checkout.schema._2.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
    }

    public void serializeURIs(com.google.checkout.schema._2.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.google.checkout.schema._2.OrderStateChangeNotification.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsr\u0000!com.sun.msv.grammar.InterleaveExp\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0006ppsr\u0000\'"
+"com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameCla"
+"sst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar."
+"ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontent"
+"Modelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003pp\u0000sq\u0000~\u0000\u0000ppsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~"
+"\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000\"com.sun"
+".msv.datatype.xsd.TokenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.dataty"
+"pe.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com.sun.msv."
+"datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.dat"
+"atype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xs"
+"d.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012Ljava/lang/Stri"
+"ng;L\u0000\btypeNameq\u0000~\u0000\u001bL\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd"
+"/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000"
+"\u0005tokensr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Colla"
+"pse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcess"
+"or\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000com.sun.msv.grammar.Expression$NullSetEx"
+"pression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003ppsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t"
+"\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001bL\u0000\fnamespaceURIq\u0000~\u0000\u001bxpq\u0000~\u0000\u001fq\u0000~\u0000\u001esr"
+"\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000 com.su"
+"n.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClass"
+"q\u0000~\u0000\u000exq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000"
+"\u0012ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0018q\u0000"
+"~\u0000\u001et\u0000\u0005QNameq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%q\u0000~\u00000q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar"
+".SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001bL\u0000\fnamespaceURIq"
+"\u0000~\u0000\u001bxr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0004typet\u0000)"
+"http://www.w3.org/2001/XMLSchema-instancesr\u00000com.sun.msv.gra"
+"mmar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000+\u0001q\u0000~"
+"\u00008sq\u0000~\u00002t\u0000\u0013google-order-numbert\u0000#http://checkout.google.com/"
+"schema/2sq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0012ppsr\u0000)com.sun.msv.datatype.xs"
+"d.EnumerationFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0006valuest\u0000\u000fLjava/util/Set;xr\u00009"
+"com.sun.msv.datatype.xsd.DataTypeWithValueConstraintFacet\"\u00a7R"
+"o\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueCheckFlagL\u0000\bbaseTypet\u0000)Lcom/"
+"sun/msv/datatype/xsd/XSDatatypeImpl;L\u0000\fconcreteTypet\u0000\'Lcom/s"
+"un/msv/datatype/xsd/ConcreteType;L\u0000\tfacetNameq\u0000~\u0000\u001bxq\u0000~\u0000\u001aq\u0000~\u0000"
+"<t\u0000\u0013FinancialOrderStateq\u0000~\u0000\"\u0000\u0000q\u0000~\u0000\u001dq\u0000~\u0000\u001dt\u0000\u000benumerationsr\u0000\u0011ja"
+"va.util.HashSet\u00baD\u0085\u0095\u0096\u00b8\u00b74\u0003\u0000\u0000xpw\f\u0000\u0000\u0000\u0010?@\u0000\u0000\u0000\u0000\u0000\u0007t\u0000\u0007CHARGEDt\u0000\u0010PAYME"
+"NT_DECLINEDt\u0000\u0013CANCELLED_BY_GOOGLEt\u0000\bCHARGINGt\u0000\nCHARGEABLEt\u0000\t"
+"CANCELLEDt\u0000\tREVIEWINGxq\u0000~\u0000$sq\u0000~\u0000%q\u0000~\u0000Gq\u0000~\u0000<sq\u0000~\u0000\'ppsq\u0000~\u0000)q\u0000~"
+"\u0000,pq\u0000~\u0000-q\u0000~\u00004q\u0000~\u00008sq\u0000~\u00002t\u0000\u0019new-financial-order-stateq\u0000~\u0000<sq\u0000"
+"~\u0000\rpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0012ppsq\u0000~\u0000@q\u0000~\u0000<t\u0000\u0015FulfillmentOrderStateq\u0000~"
+"\u0000\"\u0000\u0000q\u0000~\u0000\u001dq\u0000~\u0000\u001dq\u0000~\u0000Hsq\u0000~\u0000Iw\f\u0000\u0000\u0000\u0010?@\u0000\u0000\u0000\u0000\u0000\u0004t\u0000\nPROCESSINGt\u0000\tDELIV"
+"EREDt\u0000\u0003NEWt\u0000\u0010WILL_NOT_DELIVERxq\u0000~\u0000$sq\u0000~\u0000%q\u0000~\u0000[q\u0000~\u0000<sq\u0000~\u0000\'pps"
+"q\u0000~\u0000)q\u0000~\u0000,pq\u0000~\u0000-q\u0000~\u00004q\u0000~\u00008sq\u0000~\u00002t\u0000\u001bnew-fulfillment-order-sta"
+"teq\u0000~\u0000<sq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\u0000ppq\u0000~\u0000?sq\u0000~\u0000\'ppsq\u0000~\u0000)q\u0000~\u0000,pq\u0000~\u0000-q\u0000~\u00004q"
+"\u0000~\u00008sq\u0000~\u00002t\u0000\u001eprevious-financial-order-stateq\u0000~\u0000<sq\u0000~\u0000\rpp\u0000sq\u0000"
+"~\u0000\u0000ppq\u0000~\u0000Ysq\u0000~\u0000\'ppsq\u0000~\u0000)q\u0000~\u0000,pq\u0000~\u0000-q\u0000~\u00004q\u0000~\u00008sq\u0000~\u00002t\u0000 previo"
+"us-fulfillment-order-stateq\u0000~\u0000<sq\u0000~\u0000\'ppsq\u0000~\u0000\rq\u0000~\u0000,p\u0000sq\u0000~\u0000\u0000pp"
+"sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u0017q\u0000~\u0000\u001et\u0000\u0006stringsr\u00005com.sun.msv.datatype.xsd.Whi"
+"teSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000!\u0001q\u0000~\u0000$sq\u0000~\u0000%q\u0000~\u0000wq"
+"\u0000~\u0000\u001esq\u0000~\u0000\'ppsq\u0000~\u0000)q\u0000~\u0000,pq\u0000~\u0000-q\u0000~\u00004q\u0000~\u00008sq\u0000~\u00002t\u0000\u0006reasonq\u0000~\u0000<q"
+"\u0000~\u00008sq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0012ppsr\u0000%com.sun.msv.datatype.xsd.Da"
+"teTimeType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000)com.sun.msv.datatype.xsd.DateTimeBa"
+"seType\u0014W\u001a@3\u00a5\u00b4\u00e5\u0002\u0000\u0000xq\u0000~\u0000\u0018q\u0000~\u0000\u001et\u0000\bdateTimeq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%q\u0000~\u0000\u0085"
+"q\u0000~\u0000\u001esq\u0000~\u0000\'ppsq\u0000~\u0000)q\u0000~\u0000,pq\u0000~\u0000-q\u0000~\u00004q\u0000~\u00008sq\u0000~\u00002t\u0000\ttimestampq\u0000"
+"~\u0000<sq\u0000~\u0000)ppq\u0000~\u0000usq\u0000~\u00002t\u0000\rserial-numbert\u0000\u0000sr\u0000\"com.sun.msv.gra"
+"mmar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/gra"
+"mmar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Exp"
+"ressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006"
+"parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\u0016\u0001pq\u0000~\u0000\tq\u0000"
+"~\u0000tq\u0000~\u0000\nq\u0000~\u0000\u000bq\u0000~\u0000rq\u0000~\u0000\fq\u0000~\u0000\u0080q\u0000~\u0000(q\u0000~\u0000Sq\u0000~\u0000bq\u0000~\u0000hq\u0000~\u0000nq\u0000~\u0000{q\u0000"
+"~\u0000\u0087q\u0000~\u0000\u0007q\u0000~\u0000\bq\u0000~\u0000\u0011q\u0000~\u0000>q\u0000~\u0000gq\u0000~\u0000\u0005q\u0000~\u0000Xq\u0000~\u0000mx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.google.checkout.schema._2.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.google.checkout.schema._2.impl.runtime.UnmarshallingContext context) {
            super(context, "------------------");
        }

        protected Unmarshaller(com.google.checkout.schema._2.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.google.checkout.schema._2.impl.OrderStateChangeNotificationImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        if (("timestamp" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 16;
                            return ;
                        }
                        if (("reason" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 12;
                            return ;
                        }
                        if (("previous-fulfillment-order-state" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 4;
                            return ;
                        }
                        if (("previous-financial-order-state" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 14;
                            return ;
                        }
                        if (("new-fulfillment-order-state" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 6;
                            return ;
                        }
                        if (("new-financial-order-state" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 8;
                            return ;
                        }
                        if (("google-order-number" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 10;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "serial-number");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _SerialNumber = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  15 :
                        if (("previous-financial-order-state" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  11 :
                        if (("google-order-number" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  9 :
                        if (("new-financial-order-state" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  7 :
                        if (("new-fulfillment-order-state" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  17 :
                        if (("timestamp" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "serial-number");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        break;
                    case  5 :
                        if (("previous-fulfillment-order-state" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  13 :
                        if (("reason" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        if (("serial-number" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        break;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        if (("serial-number" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "serial-number");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        break;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  1 :
                            state = 2;
                            eatText1(value);
                            return ;
                        case  6 :
                            state = 7;
                            eatText2(value);
                            return ;
                        case  16 :
                            state = 17;
                            eatText3(value);
                            return ;
                        case  12 :
                            state = 13;
                            eatText4(value);
                            return ;
                        case  8 :
                            state = 9;
                            eatText5(value);
                            return ;
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                        case  14 :
                            state = 15;
                            eatText6(value);
                            return ;
                        case  10 :
                            state = 11;
                            eatText7(value);
                            return ;
                        case  0 :
                            attIdx = context.getAttribute("", "serial-number");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 3;
                                eatText1(v);
                                continue outer;
                            }
                            break;
                        case  4 :
                            state = 5;
                            eatText8(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _NewFulfillmentOrderState = com.sun.xml.bind.WhiteSpaceProcessor.collapse(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText3(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Timestamp = ((java.util.Calendar) com.sun.msv.datatype.xsd.DateTimeType.theInstance.createJavaObject(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value), null));
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText4(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Reason = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText5(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _NewFinancialOrderState = com.sun.xml.bind.WhiteSpaceProcessor.collapse(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText6(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _PreviousFinancialOrderState = com.sun.xml.bind.WhiteSpaceProcessor.collapse(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText7(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _GoogleOrderNumber = com.sun.xml.bind.WhiteSpaceProcessor.collapse(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText8(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _PreviousFulfillmentOrderState = com.sun.xml.bind.WhiteSpaceProcessor.collapse(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}
