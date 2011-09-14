/*
 * XML Type:  Resource
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.Resource
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400;


/**
 * An XML Resource(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public interface Resource extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Resource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("resourcea3b8type");
    
    /**
     * Gets the "targetPath" element
     */
    java.lang.String getTargetPath();
    
    /**
     * Gets (as xml) the "targetPath" element
     */
    org.apache.xmlbeans.XmlString xgetTargetPath();
    
    /**
     * True if has "targetPath" element
     */
    boolean isSetTargetPath();
    
    /**
     * Sets the "targetPath" element
     */
    void setTargetPath(java.lang.String targetPath);
    
    /**
     * Sets (as xml) the "targetPath" element
     */
    void xsetTargetPath(org.apache.xmlbeans.XmlString targetPath);
    
    /**
     * Unsets the "targetPath" element
     */
    void unsetTargetPath();
    
    /**
     * Gets the "filtering" element
     */
    boolean getFiltering();
    
    /**
     * Gets (as xml) the "filtering" element
     */
    org.apache.xmlbeans.XmlBoolean xgetFiltering();
    
    /**
     * True if has "filtering" element
     */
    boolean isSetFiltering();
    
    /**
     * Sets the "filtering" element
     */
    void setFiltering(boolean filtering);
    
    /**
     * Sets (as xml) the "filtering" element
     */
    void xsetFiltering(org.apache.xmlbeans.XmlBoolean filtering);
    
    /**
     * Unsets the "filtering" element
     */
    void unsetFiltering();
    
    /**
     * Gets the "directory" element
     */
    java.lang.String getDirectory();
    
    /**
     * Gets (as xml) the "directory" element
     */
    org.apache.xmlbeans.XmlString xgetDirectory();
    
    /**
     * True if has "directory" element
     */
    boolean isSetDirectory();
    
    /**
     * Sets the "directory" element
     */
    void setDirectory(java.lang.String directory);
    
    /**
     * Sets (as xml) the "directory" element
     */
    void xsetDirectory(org.apache.xmlbeans.XmlString directory);
    
    /**
     * Unsets the "directory" element
     */
    void unsetDirectory();
    
    /**
     * Gets the "includes" element
     */
    org.apache.maven.pom.x400.Resource.Includes getIncludes();
    
    /**
     * True if has "includes" element
     */
    boolean isSetIncludes();
    
    /**
     * Sets the "includes" element
     */
    void setIncludes(org.apache.maven.pom.x400.Resource.Includes includes);
    
    /**
     * Appends and returns a new empty "includes" element
     */
    org.apache.maven.pom.x400.Resource.Includes addNewIncludes();
    
    /**
     * Unsets the "includes" element
     */
    void unsetIncludes();
    
    /**
     * Gets the "excludes" element
     */
    org.apache.maven.pom.x400.Resource.Excludes getExcludes();
    
    /**
     * True if has "excludes" element
     */
    boolean isSetExcludes();
    
    /**
     * Sets the "excludes" element
     */
    void setExcludes(org.apache.maven.pom.x400.Resource.Excludes excludes);
    
    /**
     * Appends and returns a new empty "excludes" element
     */
    org.apache.maven.pom.x400.Resource.Excludes addNewExcludes();
    
    /**
     * Unsets the "excludes" element
     */
    void unsetExcludes();
    
    /**
     * An XML includes(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Includes extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Includes.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("includes0db1elemtype");
        
        /**
         * Gets array of all "include" elements
         */
        java.lang.String[] getIncludeArray();
        
        /**
         * Gets ith "include" element
         */
        java.lang.String getIncludeArray(int i);
        
        /**
         * Gets (as xml) array of all "include" elements
         */
        org.apache.xmlbeans.XmlString[] xgetIncludeArray();
        
        /**
         * Gets (as xml) ith "include" element
         */
        org.apache.xmlbeans.XmlString xgetIncludeArray(int i);
        
        /**
         * Returns number of "include" element
         */
        int sizeOfIncludeArray();
        
        /**
         * Sets array of all "include" element
         */
        void setIncludeArray(java.lang.String[] includeArray);
        
        /**
         * Sets ith "include" element
         */
        void setIncludeArray(int i, java.lang.String include);
        
        /**
         * Sets (as xml) array of all "include" element
         */
        void xsetIncludeArray(org.apache.xmlbeans.XmlString[] includeArray);
        
        /**
         * Sets (as xml) ith "include" element
         */
        void xsetIncludeArray(int i, org.apache.xmlbeans.XmlString include);
        
        /**
         * Inserts the value as the ith "include" element
         */
        void insertInclude(int i, java.lang.String include);
        
        /**
         * Appends the value as the last "include" element
         */
        void addInclude(java.lang.String include);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "include" element
         */
        org.apache.xmlbeans.XmlString insertNewInclude(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "include" element
         */
        org.apache.xmlbeans.XmlString addNewInclude();
        
        /**
         * Removes the ith "include" element
         */
        void removeInclude(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Resource.Includes newInstance() {
              return (org.apache.maven.pom.x400.Resource.Includes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Resource.Includes newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Resource.Includes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML excludes(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Excludes extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Excludes.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("excludes4f63elemtype");
        
        /**
         * Gets array of all "exclude" elements
         */
        java.lang.String[] getExcludeArray();
        
        /**
         * Gets ith "exclude" element
         */
        java.lang.String getExcludeArray(int i);
        
        /**
         * Gets (as xml) array of all "exclude" elements
         */
        org.apache.xmlbeans.XmlString[] xgetExcludeArray();
        
        /**
         * Gets (as xml) ith "exclude" element
         */
        org.apache.xmlbeans.XmlString xgetExcludeArray(int i);
        
        /**
         * Returns number of "exclude" element
         */
        int sizeOfExcludeArray();
        
        /**
         * Sets array of all "exclude" element
         */
        void setExcludeArray(java.lang.String[] excludeArray);
        
        /**
         * Sets ith "exclude" element
         */
        void setExcludeArray(int i, java.lang.String exclude);
        
        /**
         * Sets (as xml) array of all "exclude" element
         */
        void xsetExcludeArray(org.apache.xmlbeans.XmlString[] excludeArray);
        
        /**
         * Sets (as xml) ith "exclude" element
         */
        void xsetExcludeArray(int i, org.apache.xmlbeans.XmlString exclude);
        
        /**
         * Inserts the value as the ith "exclude" element
         */
        void insertExclude(int i, java.lang.String exclude);
        
        /**
         * Appends the value as the last "exclude" element
         */
        void addExclude(java.lang.String exclude);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "exclude" element
         */
        org.apache.xmlbeans.XmlString insertNewExclude(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "exclude" element
         */
        org.apache.xmlbeans.XmlString addNewExclude();
        
        /**
         * Removes the ith "exclude" element
         */
        void removeExclude(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Resource.Excludes newInstance() {
              return (org.apache.maven.pom.x400.Resource.Excludes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Resource.Excludes newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Resource.Excludes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.maven.pom.x400.Resource newInstance() {
          return (org.apache.maven.pom.x400.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.maven.pom.x400.Resource newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.maven.pom.x400.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.maven.pom.x400.Resource parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.maven.pom.x400.Resource parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.maven.pom.x400.Resource parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.maven.pom.x400.Resource parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.maven.pom.x400.Resource parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.maven.pom.x400.Resource parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.maven.pom.x400.Resource parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.maven.pom.x400.Resource parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.maven.pom.x400.Resource parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.maven.pom.x400.Resource parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.maven.pom.x400.Resource parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.maven.pom.x400.Resource parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.maven.pom.x400.Resource parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.maven.pom.x400.Resource parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.Resource parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.Resource parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
