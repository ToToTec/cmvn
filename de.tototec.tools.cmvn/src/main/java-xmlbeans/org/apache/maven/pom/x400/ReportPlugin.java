/*
 * XML Type:  ReportPlugin
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.ReportPlugin
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400;


/**
 * An XML ReportPlugin(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public interface ReportPlugin extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReportPlugin.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("reportplugin6e71type");
    
    /**
     * Gets the "groupId" element
     */
    java.lang.String getGroupId();
    
    /**
     * Gets (as xml) the "groupId" element
     */
    org.apache.xmlbeans.XmlString xgetGroupId();
    
    /**
     * True if has "groupId" element
     */
    boolean isSetGroupId();
    
    /**
     * Sets the "groupId" element
     */
    void setGroupId(java.lang.String groupId);
    
    /**
     * Sets (as xml) the "groupId" element
     */
    void xsetGroupId(org.apache.xmlbeans.XmlString groupId);
    
    /**
     * Unsets the "groupId" element
     */
    void unsetGroupId();
    
    /**
     * Gets the "artifactId" element
     */
    java.lang.String getArtifactId();
    
    /**
     * Gets (as xml) the "artifactId" element
     */
    org.apache.xmlbeans.XmlString xgetArtifactId();
    
    /**
     * True if has "artifactId" element
     */
    boolean isSetArtifactId();
    
    /**
     * Sets the "artifactId" element
     */
    void setArtifactId(java.lang.String artifactId);
    
    /**
     * Sets (as xml) the "artifactId" element
     */
    void xsetArtifactId(org.apache.xmlbeans.XmlString artifactId);
    
    /**
     * Unsets the "artifactId" element
     */
    void unsetArtifactId();
    
    /**
     * Gets the "version" element
     */
    java.lang.String getVersion();
    
    /**
     * Gets (as xml) the "version" element
     */
    org.apache.xmlbeans.XmlString xgetVersion();
    
    /**
     * True if has "version" element
     */
    boolean isSetVersion();
    
    /**
     * Sets the "version" element
     */
    void setVersion(java.lang.String version);
    
    /**
     * Sets (as xml) the "version" element
     */
    void xsetVersion(org.apache.xmlbeans.XmlString version);
    
    /**
     * Unsets the "version" element
     */
    void unsetVersion();
    
    /**
     * Gets the "inherited" element
     */
    java.lang.String getInherited();
    
    /**
     * Gets (as xml) the "inherited" element
     */
    org.apache.xmlbeans.XmlString xgetInherited();
    
    /**
     * True if has "inherited" element
     */
    boolean isSetInherited();
    
    /**
     * Sets the "inherited" element
     */
    void setInherited(java.lang.String inherited);
    
    /**
     * Sets (as xml) the "inherited" element
     */
    void xsetInherited(org.apache.xmlbeans.XmlString inherited);
    
    /**
     * Unsets the "inherited" element
     */
    void unsetInherited();
    
    /**
     * Gets the "configuration" element
     */
    org.apache.maven.pom.x400.ReportPlugin.Configuration getConfiguration();
    
    /**
     * True if has "configuration" element
     */
    boolean isSetConfiguration();
    
    /**
     * Sets the "configuration" element
     */
    void setConfiguration(org.apache.maven.pom.x400.ReportPlugin.Configuration configuration);
    
    /**
     * Appends and returns a new empty "configuration" element
     */
    org.apache.maven.pom.x400.ReportPlugin.Configuration addNewConfiguration();
    
    /**
     * Unsets the "configuration" element
     */
    void unsetConfiguration();
    
    /**
     * Gets the "reportSets" element
     */
    org.apache.maven.pom.x400.ReportPlugin.ReportSets getReportSets();
    
    /**
     * True if has "reportSets" element
     */
    boolean isSetReportSets();
    
    /**
     * Sets the "reportSets" element
     */
    void setReportSets(org.apache.maven.pom.x400.ReportPlugin.ReportSets reportSets);
    
    /**
     * Appends and returns a new empty "reportSets" element
     */
    org.apache.maven.pom.x400.ReportPlugin.ReportSets addNewReportSets();
    
    /**
     * Unsets the "reportSets" element
     */
    void unsetReportSets();
    
    /**
     * An XML configuration(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Configuration extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Configuration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("configuration434felemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.ReportPlugin.Configuration newInstance() {
              return (org.apache.maven.pom.x400.ReportPlugin.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.ReportPlugin.Configuration newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.ReportPlugin.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML reportSets(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface ReportSets extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReportSets.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("reportsetsd250elemtype");
        
        /**
         * Gets array of all "reportSet" elements
         */
        org.apache.maven.pom.x400.ReportSet[] getReportSetArray();
        
        /**
         * Gets ith "reportSet" element
         */
        org.apache.maven.pom.x400.ReportSet getReportSetArray(int i);
        
        /**
         * Returns number of "reportSet" element
         */
        int sizeOfReportSetArray();
        
        /**
         * Sets array of all "reportSet" element
         */
        void setReportSetArray(org.apache.maven.pom.x400.ReportSet[] reportSetArray);
        
        /**
         * Sets ith "reportSet" element
         */
        void setReportSetArray(int i, org.apache.maven.pom.x400.ReportSet reportSet);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "reportSet" element
         */
        org.apache.maven.pom.x400.ReportSet insertNewReportSet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "reportSet" element
         */
        org.apache.maven.pom.x400.ReportSet addNewReportSet();
        
        /**
         * Removes the ith "reportSet" element
         */
        void removeReportSet(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.ReportPlugin.ReportSets newInstance() {
              return (org.apache.maven.pom.x400.ReportPlugin.ReportSets) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.ReportPlugin.ReportSets newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.ReportPlugin.ReportSets) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.maven.pom.x400.ReportPlugin newInstance() {
          return (org.apache.maven.pom.x400.ReportPlugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.maven.pom.x400.ReportPlugin newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.maven.pom.x400.ReportPlugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.maven.pom.x400.ReportPlugin parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.ReportPlugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.maven.pom.x400.ReportPlugin parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.ReportPlugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.maven.pom.x400.ReportPlugin parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.ReportPlugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.maven.pom.x400.ReportPlugin parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.ReportPlugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.maven.pom.x400.ReportPlugin parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.ReportPlugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.maven.pom.x400.ReportPlugin parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.ReportPlugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.maven.pom.x400.ReportPlugin parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.ReportPlugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.maven.pom.x400.ReportPlugin parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.ReportPlugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.maven.pom.x400.ReportPlugin parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.ReportPlugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.maven.pom.x400.ReportPlugin parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.ReportPlugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.maven.pom.x400.ReportPlugin parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.ReportPlugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.maven.pom.x400.ReportPlugin parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.ReportPlugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.maven.pom.x400.ReportPlugin parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.ReportPlugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.maven.pom.x400.ReportPlugin parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.ReportPlugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.ReportPlugin parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.ReportPlugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.ReportPlugin parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.ReportPlugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
