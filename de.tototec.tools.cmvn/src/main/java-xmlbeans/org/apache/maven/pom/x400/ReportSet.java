/*
 * XML Type:  ReportSet
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.ReportSet
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400;


/**
 * An XML ReportSet(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public interface ReportSet extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReportSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("reportset74c6type");
    
    /**
     * Gets the "id" element
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" element
     */
    org.apache.xmlbeans.XmlString xgetId();
    
    /**
     * True if has "id" element
     */
    boolean isSetId();
    
    /**
     * Sets the "id" element
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" element
     */
    void xsetId(org.apache.xmlbeans.XmlString id);
    
    /**
     * Unsets the "id" element
     */
    void unsetId();
    
    /**
     * Gets the "configuration" element
     */
    org.apache.maven.pom.x400.ReportSet.Configuration getConfiguration();
    
    /**
     * True if has "configuration" element
     */
    boolean isSetConfiguration();
    
    /**
     * Sets the "configuration" element
     */
    void setConfiguration(org.apache.maven.pom.x400.ReportSet.Configuration configuration);
    
    /**
     * Appends and returns a new empty "configuration" element
     */
    org.apache.maven.pom.x400.ReportSet.Configuration addNewConfiguration();
    
    /**
     * Unsets the "configuration" element
     */
    void unsetConfiguration();
    
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
     * Gets the "reports" element
     */
    org.apache.maven.pom.x400.ReportSet.Reports getReports();
    
    /**
     * True if has "reports" element
     */
    boolean isSetReports();
    
    /**
     * Sets the "reports" element
     */
    void setReports(org.apache.maven.pom.x400.ReportSet.Reports reports);
    
    /**
     * Appends and returns a new empty "reports" element
     */
    org.apache.maven.pom.x400.ReportSet.Reports addNewReports();
    
    /**
     * Unsets the "reports" element
     */
    void unsetReports();
    
    /**
     * An XML configuration(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Configuration extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Configuration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("configurationfca8elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.ReportSet.Configuration newInstance() {
              return (org.apache.maven.pom.x400.ReportSet.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.ReportSet.Configuration newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.ReportSet.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML reports(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Reports extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Reports.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("reports4fb1elemtype");
        
        /**
         * Gets array of all "report" elements
         */
        java.lang.String[] getReportArray();
        
        /**
         * Gets ith "report" element
         */
        java.lang.String getReportArray(int i);
        
        /**
         * Gets (as xml) array of all "report" elements
         */
        org.apache.xmlbeans.XmlString[] xgetReportArray();
        
        /**
         * Gets (as xml) ith "report" element
         */
        org.apache.xmlbeans.XmlString xgetReportArray(int i);
        
        /**
         * Returns number of "report" element
         */
        int sizeOfReportArray();
        
        /**
         * Sets array of all "report" element
         */
        void setReportArray(java.lang.String[] reportArray);
        
        /**
         * Sets ith "report" element
         */
        void setReportArray(int i, java.lang.String report);
        
        /**
         * Sets (as xml) array of all "report" element
         */
        void xsetReportArray(org.apache.xmlbeans.XmlString[] reportArray);
        
        /**
         * Sets (as xml) ith "report" element
         */
        void xsetReportArray(int i, org.apache.xmlbeans.XmlString report);
        
        /**
         * Inserts the value as the ith "report" element
         */
        void insertReport(int i, java.lang.String report);
        
        /**
         * Appends the value as the last "report" element
         */
        void addReport(java.lang.String report);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "report" element
         */
        org.apache.xmlbeans.XmlString insertNewReport(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "report" element
         */
        org.apache.xmlbeans.XmlString addNewReport();
        
        /**
         * Removes the ith "report" element
         */
        void removeReport(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.ReportSet.Reports newInstance() {
              return (org.apache.maven.pom.x400.ReportSet.Reports) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.ReportSet.Reports newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.ReportSet.Reports) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.maven.pom.x400.ReportSet newInstance() {
          return (org.apache.maven.pom.x400.ReportSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.maven.pom.x400.ReportSet newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.maven.pom.x400.ReportSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.maven.pom.x400.ReportSet parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.ReportSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.maven.pom.x400.ReportSet parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.ReportSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.maven.pom.x400.ReportSet parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.ReportSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.maven.pom.x400.ReportSet parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.ReportSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.maven.pom.x400.ReportSet parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.ReportSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.maven.pom.x400.ReportSet parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.ReportSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.maven.pom.x400.ReportSet parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.ReportSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.maven.pom.x400.ReportSet parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.ReportSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.maven.pom.x400.ReportSet parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.ReportSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.maven.pom.x400.ReportSet parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.ReportSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.maven.pom.x400.ReportSet parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.ReportSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.maven.pom.x400.ReportSet parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.ReportSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.maven.pom.x400.ReportSet parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.ReportSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.maven.pom.x400.ReportSet parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.ReportSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.ReportSet parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.ReportSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.ReportSet parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.ReportSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
