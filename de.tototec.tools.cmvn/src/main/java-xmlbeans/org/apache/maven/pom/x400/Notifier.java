/*
 * XML Type:  Notifier
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.Notifier
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400;


/**
 * An XML Notifier(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public interface Notifier extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Notifier.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("notifier3350type");
    
    /**
     * Gets the "type" element
     */
    java.lang.String getType();
    
    /**
     * Gets (as xml) the "type" element
     */
    org.apache.xmlbeans.XmlString xgetType();
    
    /**
     * True if has "type" element
     */
    boolean isSetType();
    
    /**
     * Sets the "type" element
     */
    void setType(java.lang.String type);
    
    /**
     * Sets (as xml) the "type" element
     */
    void xsetType(org.apache.xmlbeans.XmlString type);
    
    /**
     * Unsets the "type" element
     */
    void unsetType();
    
    /**
     * Gets the "sendOnError" element
     */
    boolean getSendOnError();
    
    /**
     * Gets (as xml) the "sendOnError" element
     */
    org.apache.xmlbeans.XmlBoolean xgetSendOnError();
    
    /**
     * True if has "sendOnError" element
     */
    boolean isSetSendOnError();
    
    /**
     * Sets the "sendOnError" element
     */
    void setSendOnError(boolean sendOnError);
    
    /**
     * Sets (as xml) the "sendOnError" element
     */
    void xsetSendOnError(org.apache.xmlbeans.XmlBoolean sendOnError);
    
    /**
     * Unsets the "sendOnError" element
     */
    void unsetSendOnError();
    
    /**
     * Gets the "sendOnFailure" element
     */
    boolean getSendOnFailure();
    
    /**
     * Gets (as xml) the "sendOnFailure" element
     */
    org.apache.xmlbeans.XmlBoolean xgetSendOnFailure();
    
    /**
     * True if has "sendOnFailure" element
     */
    boolean isSetSendOnFailure();
    
    /**
     * Sets the "sendOnFailure" element
     */
    void setSendOnFailure(boolean sendOnFailure);
    
    /**
     * Sets (as xml) the "sendOnFailure" element
     */
    void xsetSendOnFailure(org.apache.xmlbeans.XmlBoolean sendOnFailure);
    
    /**
     * Unsets the "sendOnFailure" element
     */
    void unsetSendOnFailure();
    
    /**
     * Gets the "sendOnSuccess" element
     */
    boolean getSendOnSuccess();
    
    /**
     * Gets (as xml) the "sendOnSuccess" element
     */
    org.apache.xmlbeans.XmlBoolean xgetSendOnSuccess();
    
    /**
     * True if has "sendOnSuccess" element
     */
    boolean isSetSendOnSuccess();
    
    /**
     * Sets the "sendOnSuccess" element
     */
    void setSendOnSuccess(boolean sendOnSuccess);
    
    /**
     * Sets (as xml) the "sendOnSuccess" element
     */
    void xsetSendOnSuccess(org.apache.xmlbeans.XmlBoolean sendOnSuccess);
    
    /**
     * Unsets the "sendOnSuccess" element
     */
    void unsetSendOnSuccess();
    
    /**
     * Gets the "sendOnWarning" element
     */
    boolean getSendOnWarning();
    
    /**
     * Gets (as xml) the "sendOnWarning" element
     */
    org.apache.xmlbeans.XmlBoolean xgetSendOnWarning();
    
    /**
     * True if has "sendOnWarning" element
     */
    boolean isSetSendOnWarning();
    
    /**
     * Sets the "sendOnWarning" element
     */
    void setSendOnWarning(boolean sendOnWarning);
    
    /**
     * Sets (as xml) the "sendOnWarning" element
     */
    void xsetSendOnWarning(org.apache.xmlbeans.XmlBoolean sendOnWarning);
    
    /**
     * Unsets the "sendOnWarning" element
     */
    void unsetSendOnWarning();
    
    /**
     * Gets the "address" element
     */
    java.lang.String getAddress();
    
    /**
     * Gets (as xml) the "address" element
     */
    org.apache.xmlbeans.XmlString xgetAddress();
    
    /**
     * True if has "address" element
     */
    boolean isSetAddress();
    
    /**
     * Sets the "address" element
     */
    void setAddress(java.lang.String address);
    
    /**
     * Sets (as xml) the "address" element
     */
    void xsetAddress(org.apache.xmlbeans.XmlString address);
    
    /**
     * Unsets the "address" element
     */
    void unsetAddress();
    
    /**
     * Gets the "configuration" element
     */
    org.apache.maven.pom.x400.Notifier.Configuration getConfiguration();
    
    /**
     * True if has "configuration" element
     */
    boolean isSetConfiguration();
    
    /**
     * Sets the "configuration" element
     */
    void setConfiguration(org.apache.maven.pom.x400.Notifier.Configuration configuration);
    
    /**
     * Appends and returns a new empty "configuration" element
     */
    org.apache.maven.pom.x400.Notifier.Configuration addNewConfiguration();
    
    /**
     * Unsets the "configuration" element
     */
    void unsetConfiguration();
    
    /**
     * An XML configuration(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Configuration extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Configuration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("configuration272eelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Notifier.Configuration newInstance() {
              return (org.apache.maven.pom.x400.Notifier.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Notifier.Configuration newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Notifier.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.maven.pom.x400.Notifier newInstance() {
          return (org.apache.maven.pom.x400.Notifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.maven.pom.x400.Notifier newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.maven.pom.x400.Notifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.maven.pom.x400.Notifier parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Notifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.maven.pom.x400.Notifier parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Notifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.maven.pom.x400.Notifier parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Notifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.maven.pom.x400.Notifier parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Notifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.maven.pom.x400.Notifier parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Notifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.maven.pom.x400.Notifier parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Notifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.maven.pom.x400.Notifier parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Notifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.maven.pom.x400.Notifier parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Notifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.maven.pom.x400.Notifier parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Notifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.maven.pom.x400.Notifier parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Notifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.maven.pom.x400.Notifier parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Notifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.maven.pom.x400.Notifier parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Notifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.maven.pom.x400.Notifier parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Notifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.maven.pom.x400.Notifier parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Notifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.Notifier parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.Notifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.Notifier parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.Notifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
