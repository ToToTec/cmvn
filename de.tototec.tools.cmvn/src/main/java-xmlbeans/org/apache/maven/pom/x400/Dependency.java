/*
 * XML Type:  Dependency
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.Dependency
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400;


/**
 * An XML Dependency(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public interface Dependency extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Dependency.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("dependencyf575type");
    
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
     * Gets the "classifier" element
     */
    java.lang.String getClassifier();
    
    /**
     * Gets (as xml) the "classifier" element
     */
    org.apache.xmlbeans.XmlString xgetClassifier();
    
    /**
     * True if has "classifier" element
     */
    boolean isSetClassifier();
    
    /**
     * Sets the "classifier" element
     */
    void setClassifier(java.lang.String classifier);
    
    /**
     * Sets (as xml) the "classifier" element
     */
    void xsetClassifier(org.apache.xmlbeans.XmlString classifier);
    
    /**
     * Unsets the "classifier" element
     */
    void unsetClassifier();
    
    /**
     * Gets the "scope" element
     */
    java.lang.String getScope();
    
    /**
     * Gets (as xml) the "scope" element
     */
    org.apache.xmlbeans.XmlString xgetScope();
    
    /**
     * True if has "scope" element
     */
    boolean isSetScope();
    
    /**
     * Sets the "scope" element
     */
    void setScope(java.lang.String scope);
    
    /**
     * Sets (as xml) the "scope" element
     */
    void xsetScope(org.apache.xmlbeans.XmlString scope);
    
    /**
     * Unsets the "scope" element
     */
    void unsetScope();
    
    /**
     * Gets the "systemPath" element
     */
    java.lang.String getSystemPath();
    
    /**
     * Gets (as xml) the "systemPath" element
     */
    org.apache.xmlbeans.XmlString xgetSystemPath();
    
    /**
     * True if has "systemPath" element
     */
    boolean isSetSystemPath();
    
    /**
     * Sets the "systemPath" element
     */
    void setSystemPath(java.lang.String systemPath);
    
    /**
     * Sets (as xml) the "systemPath" element
     */
    void xsetSystemPath(org.apache.xmlbeans.XmlString systemPath);
    
    /**
     * Unsets the "systemPath" element
     */
    void unsetSystemPath();
    
    /**
     * Gets the "exclusions" element
     */
    org.apache.maven.pom.x400.Dependency.Exclusions getExclusions();
    
    /**
     * True if has "exclusions" element
     */
    boolean isSetExclusions();
    
    /**
     * Sets the "exclusions" element
     */
    void setExclusions(org.apache.maven.pom.x400.Dependency.Exclusions exclusions);
    
    /**
     * Appends and returns a new empty "exclusions" element
     */
    org.apache.maven.pom.x400.Dependency.Exclusions addNewExclusions();
    
    /**
     * Unsets the "exclusions" element
     */
    void unsetExclusions();
    
    /**
     * Gets the "optional" element
     */
    boolean getOptional();
    
    /**
     * Gets (as xml) the "optional" element
     */
    org.apache.xmlbeans.XmlBoolean xgetOptional();
    
    /**
     * True if has "optional" element
     */
    boolean isSetOptional();
    
    /**
     * Sets the "optional" element
     */
    void setOptional(boolean optional);
    
    /**
     * Sets (as xml) the "optional" element
     */
    void xsetOptional(org.apache.xmlbeans.XmlBoolean optional);
    
    /**
     * Unsets the "optional" element
     */
    void unsetOptional();
    
    /**
     * An XML exclusions(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Exclusions extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Exclusions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("exclusions9054elemtype");
        
        /**
         * Gets array of all "exclusion" elements
         */
        org.apache.maven.pom.x400.Exclusion[] getExclusionArray();
        
        /**
         * Gets ith "exclusion" element
         */
        org.apache.maven.pom.x400.Exclusion getExclusionArray(int i);
        
        /**
         * Returns number of "exclusion" element
         */
        int sizeOfExclusionArray();
        
        /**
         * Sets array of all "exclusion" element
         */
        void setExclusionArray(org.apache.maven.pom.x400.Exclusion[] exclusionArray);
        
        /**
         * Sets ith "exclusion" element
         */
        void setExclusionArray(int i, org.apache.maven.pom.x400.Exclusion exclusion);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "exclusion" element
         */
        org.apache.maven.pom.x400.Exclusion insertNewExclusion(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "exclusion" element
         */
        org.apache.maven.pom.x400.Exclusion addNewExclusion();
        
        /**
         * Removes the ith "exclusion" element
         */
        void removeExclusion(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Dependency.Exclusions newInstance() {
              return (org.apache.maven.pom.x400.Dependency.Exclusions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Dependency.Exclusions newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Dependency.Exclusions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.maven.pom.x400.Dependency newInstance() {
          return (org.apache.maven.pom.x400.Dependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.maven.pom.x400.Dependency newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.maven.pom.x400.Dependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.maven.pom.x400.Dependency parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Dependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.maven.pom.x400.Dependency parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Dependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.maven.pom.x400.Dependency parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Dependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.maven.pom.x400.Dependency parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Dependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.maven.pom.x400.Dependency parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Dependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.maven.pom.x400.Dependency parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Dependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.maven.pom.x400.Dependency parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Dependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.maven.pom.x400.Dependency parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Dependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.maven.pom.x400.Dependency parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Dependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.maven.pom.x400.Dependency parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Dependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.maven.pom.x400.Dependency parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Dependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.maven.pom.x400.Dependency parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Dependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.maven.pom.x400.Dependency parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Dependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.maven.pom.x400.Dependency parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Dependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.Dependency parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.Dependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.Dependency parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.Dependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
