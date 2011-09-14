/*
 * XML Type:  Activation
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.Activation
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400;


/**
 * An XML Activation(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public interface Activation extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Activation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("activation7080type");
    
    /**
     * Gets the "activeByDefault" element
     */
    boolean getActiveByDefault();
    
    /**
     * Gets (as xml) the "activeByDefault" element
     */
    org.apache.xmlbeans.XmlBoolean xgetActiveByDefault();
    
    /**
     * True if has "activeByDefault" element
     */
    boolean isSetActiveByDefault();
    
    /**
     * Sets the "activeByDefault" element
     */
    void setActiveByDefault(boolean activeByDefault);
    
    /**
     * Sets (as xml) the "activeByDefault" element
     */
    void xsetActiveByDefault(org.apache.xmlbeans.XmlBoolean activeByDefault);
    
    /**
     * Unsets the "activeByDefault" element
     */
    void unsetActiveByDefault();
    
    /**
     * Gets the "jdk" element
     */
    java.lang.String getJdk();
    
    /**
     * Gets (as xml) the "jdk" element
     */
    org.apache.xmlbeans.XmlString xgetJdk();
    
    /**
     * True if has "jdk" element
     */
    boolean isSetJdk();
    
    /**
     * Sets the "jdk" element
     */
    void setJdk(java.lang.String jdk);
    
    /**
     * Sets (as xml) the "jdk" element
     */
    void xsetJdk(org.apache.xmlbeans.XmlString jdk);
    
    /**
     * Unsets the "jdk" element
     */
    void unsetJdk();
    
    /**
     * Gets the "os" element
     */
    org.apache.maven.pom.x400.ActivationOS getOs();
    
    /**
     * True if has "os" element
     */
    boolean isSetOs();
    
    /**
     * Sets the "os" element
     */
    void setOs(org.apache.maven.pom.x400.ActivationOS os);
    
    /**
     * Appends and returns a new empty "os" element
     */
    org.apache.maven.pom.x400.ActivationOS addNewOs();
    
    /**
     * Unsets the "os" element
     */
    void unsetOs();
    
    /**
     * Gets the "property" element
     */
    org.apache.maven.pom.x400.ActivationProperty getProperty();
    
    /**
     * True if has "property" element
     */
    boolean isSetProperty();
    
    /**
     * Sets the "property" element
     */
    void setProperty(org.apache.maven.pom.x400.ActivationProperty property);
    
    /**
     * Appends and returns a new empty "property" element
     */
    org.apache.maven.pom.x400.ActivationProperty addNewProperty();
    
    /**
     * Unsets the "property" element
     */
    void unsetProperty();
    
    /**
     * Gets the "file" element
     */
    org.apache.maven.pom.x400.ActivationFile getFile();
    
    /**
     * True if has "file" element
     */
    boolean isSetFile();
    
    /**
     * Sets the "file" element
     */
    void setFile(org.apache.maven.pom.x400.ActivationFile file);
    
    /**
     * Appends and returns a new empty "file" element
     */
    org.apache.maven.pom.x400.ActivationFile addNewFile();
    
    /**
     * Unsets the "file" element
     */
    void unsetFile();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.maven.pom.x400.Activation newInstance() {
          return (org.apache.maven.pom.x400.Activation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.maven.pom.x400.Activation newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.maven.pom.x400.Activation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.maven.pom.x400.Activation parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Activation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.maven.pom.x400.Activation parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Activation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.maven.pom.x400.Activation parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Activation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.maven.pom.x400.Activation parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Activation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.maven.pom.x400.Activation parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Activation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.maven.pom.x400.Activation parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Activation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.maven.pom.x400.Activation parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Activation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.maven.pom.x400.Activation parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Activation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.maven.pom.x400.Activation parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Activation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.maven.pom.x400.Activation parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Activation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.maven.pom.x400.Activation parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Activation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.maven.pom.x400.Activation parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Activation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.maven.pom.x400.Activation parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Activation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.maven.pom.x400.Activation parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Activation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.Activation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.Activation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.Activation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.Activation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
