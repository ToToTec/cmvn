/*
 * XML Type:  Reporting
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.Reporting
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400;


/**
 * An XML Reporting(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public interface Reporting extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Reporting.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("reportinge066type");
    
    /**
     * Gets the "excludeDefaults" element
     */
    boolean getExcludeDefaults();
    
    /**
     * Gets (as xml) the "excludeDefaults" element
     */
    org.apache.xmlbeans.XmlBoolean xgetExcludeDefaults();
    
    /**
     * True if has "excludeDefaults" element
     */
    boolean isSetExcludeDefaults();
    
    /**
     * Sets the "excludeDefaults" element
     */
    void setExcludeDefaults(boolean excludeDefaults);
    
    /**
     * Sets (as xml) the "excludeDefaults" element
     */
    void xsetExcludeDefaults(org.apache.xmlbeans.XmlBoolean excludeDefaults);
    
    /**
     * Unsets the "excludeDefaults" element
     */
    void unsetExcludeDefaults();
    
    /**
     * Gets the "outputDirectory" element
     */
    java.lang.String getOutputDirectory();
    
    /**
     * Gets (as xml) the "outputDirectory" element
     */
    org.apache.xmlbeans.XmlString xgetOutputDirectory();
    
    /**
     * True if has "outputDirectory" element
     */
    boolean isSetOutputDirectory();
    
    /**
     * Sets the "outputDirectory" element
     */
    void setOutputDirectory(java.lang.String outputDirectory);
    
    /**
     * Sets (as xml) the "outputDirectory" element
     */
    void xsetOutputDirectory(org.apache.xmlbeans.XmlString outputDirectory);
    
    /**
     * Unsets the "outputDirectory" element
     */
    void unsetOutputDirectory();
    
    /**
     * Gets the "plugins" element
     */
    org.apache.maven.pom.x400.Reporting.Plugins getPlugins();
    
    /**
     * True if has "plugins" element
     */
    boolean isSetPlugins();
    
    /**
     * Sets the "plugins" element
     */
    void setPlugins(org.apache.maven.pom.x400.Reporting.Plugins plugins);
    
    /**
     * Appends and returns a new empty "plugins" element
     */
    org.apache.maven.pom.x400.Reporting.Plugins addNewPlugins();
    
    /**
     * Unsets the "plugins" element
     */
    void unsetPlugins();
    
    /**
     * An XML plugins(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Plugins extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Plugins.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("pluginsbf72elemtype");
        
        /**
         * Gets array of all "plugin" elements
         */
        org.apache.maven.pom.x400.ReportPlugin[] getPluginArray();
        
        /**
         * Gets ith "plugin" element
         */
        org.apache.maven.pom.x400.ReportPlugin getPluginArray(int i);
        
        /**
         * Returns number of "plugin" element
         */
        int sizeOfPluginArray();
        
        /**
         * Sets array of all "plugin" element
         */
        void setPluginArray(org.apache.maven.pom.x400.ReportPlugin[] pluginArray);
        
        /**
         * Sets ith "plugin" element
         */
        void setPluginArray(int i, org.apache.maven.pom.x400.ReportPlugin plugin);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "plugin" element
         */
        org.apache.maven.pom.x400.ReportPlugin insertNewPlugin(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "plugin" element
         */
        org.apache.maven.pom.x400.ReportPlugin addNewPlugin();
        
        /**
         * Removes the ith "plugin" element
         */
        void removePlugin(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Reporting.Plugins newInstance() {
              return (org.apache.maven.pom.x400.Reporting.Plugins) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Reporting.Plugins newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Reporting.Plugins) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.maven.pom.x400.Reporting newInstance() {
          return (org.apache.maven.pom.x400.Reporting) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.maven.pom.x400.Reporting newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.maven.pom.x400.Reporting) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.maven.pom.x400.Reporting parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Reporting) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.maven.pom.x400.Reporting parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Reporting) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.maven.pom.x400.Reporting parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Reporting) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.maven.pom.x400.Reporting parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Reporting) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.maven.pom.x400.Reporting parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Reporting) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.maven.pom.x400.Reporting parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Reporting) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.maven.pom.x400.Reporting parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Reporting) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.maven.pom.x400.Reporting parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Reporting) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.maven.pom.x400.Reporting parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Reporting) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.maven.pom.x400.Reporting parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Reporting) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.maven.pom.x400.Reporting parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Reporting) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.maven.pom.x400.Reporting parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Reporting) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.maven.pom.x400.Reporting parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Reporting) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.maven.pom.x400.Reporting parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Reporting) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.Reporting parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.Reporting) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.Reporting parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.Reporting) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
