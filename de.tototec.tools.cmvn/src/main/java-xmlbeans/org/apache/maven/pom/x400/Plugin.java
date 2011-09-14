/*
 * XML Type:  Plugin
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.Plugin
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400;


/**
 * An XML Plugin(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public interface Plugin extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Plugin.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("plugin83ddtype");
    
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
     * Gets the "extensions" element
     */
    boolean getExtensions();
    
    /**
     * Gets (as xml) the "extensions" element
     */
    org.apache.xmlbeans.XmlBoolean xgetExtensions();
    
    /**
     * True if has "extensions" element
     */
    boolean isSetExtensions();
    
    /**
     * Sets the "extensions" element
     */
    void setExtensions(boolean extensions);
    
    /**
     * Sets (as xml) the "extensions" element
     */
    void xsetExtensions(org.apache.xmlbeans.XmlBoolean extensions);
    
    /**
     * Unsets the "extensions" element
     */
    void unsetExtensions();
    
    /**
     * Gets the "executions" element
     */
    org.apache.maven.pom.x400.Plugin.Executions getExecutions();
    
    /**
     * True if has "executions" element
     */
    boolean isSetExecutions();
    
    /**
     * Sets the "executions" element
     */
    void setExecutions(org.apache.maven.pom.x400.Plugin.Executions executions);
    
    /**
     * Appends and returns a new empty "executions" element
     */
    org.apache.maven.pom.x400.Plugin.Executions addNewExecutions();
    
    /**
     * Unsets the "executions" element
     */
    void unsetExecutions();
    
    /**
     * Gets the "dependencies" element
     */
    org.apache.maven.pom.x400.Plugin.Dependencies getDependencies();
    
    /**
     * True if has "dependencies" element
     */
    boolean isSetDependencies();
    
    /**
     * Sets the "dependencies" element
     */
    void setDependencies(org.apache.maven.pom.x400.Plugin.Dependencies dependencies);
    
    /**
     * Appends and returns a new empty "dependencies" element
     */
    org.apache.maven.pom.x400.Plugin.Dependencies addNewDependencies();
    
    /**
     * Unsets the "dependencies" element
     */
    void unsetDependencies();
    
    /**
     * Gets the "goals" element
     */
    org.apache.maven.pom.x400.Plugin.Goals getGoals();
    
    /**
     * True if has "goals" element
     */
    boolean isSetGoals();
    
    /**
     * Sets the "goals" element
     */
    void setGoals(org.apache.maven.pom.x400.Plugin.Goals goals);
    
    /**
     * Appends and returns a new empty "goals" element
     */
    org.apache.maven.pom.x400.Plugin.Goals addNewGoals();
    
    /**
     * Unsets the "goals" element
     */
    void unsetGoals();
    
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
    org.apache.maven.pom.x400.Plugin.Configuration getConfiguration();
    
    /**
     * True if has "configuration" element
     */
    boolean isSetConfiguration();
    
    /**
     * Sets the "configuration" element
     */
    void setConfiguration(org.apache.maven.pom.x400.Plugin.Configuration configuration);
    
    /**
     * Appends and returns a new empty "configuration" element
     */
    org.apache.maven.pom.x400.Plugin.Configuration addNewConfiguration();
    
    /**
     * Unsets the "configuration" element
     */
    void unsetConfiguration();
    
    /**
     * An XML executions(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Executions extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Executions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("executions6c86elemtype");
        
        /**
         * Gets array of all "execution" elements
         */
        org.apache.maven.pom.x400.PluginExecution[] getExecutionArray();
        
        /**
         * Gets ith "execution" element
         */
        org.apache.maven.pom.x400.PluginExecution getExecutionArray(int i);
        
        /**
         * Returns number of "execution" element
         */
        int sizeOfExecutionArray();
        
        /**
         * Sets array of all "execution" element
         */
        void setExecutionArray(org.apache.maven.pom.x400.PluginExecution[] executionArray);
        
        /**
         * Sets ith "execution" element
         */
        void setExecutionArray(int i, org.apache.maven.pom.x400.PluginExecution execution);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "execution" element
         */
        org.apache.maven.pom.x400.PluginExecution insertNewExecution(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "execution" element
         */
        org.apache.maven.pom.x400.PluginExecution addNewExecution();
        
        /**
         * Removes the ith "execution" element
         */
        void removeExecution(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Plugin.Executions newInstance() {
              return (org.apache.maven.pom.x400.Plugin.Executions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Plugin.Executions newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Plugin.Executions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML dependencies(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Dependencies extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Dependencies.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("dependencies18f8elemtype");
        
        /**
         * Gets array of all "dependency" elements
         */
        org.apache.maven.pom.x400.Dependency[] getDependencyArray();
        
        /**
         * Gets ith "dependency" element
         */
        org.apache.maven.pom.x400.Dependency getDependencyArray(int i);
        
        /**
         * Returns number of "dependency" element
         */
        int sizeOfDependencyArray();
        
        /**
         * Sets array of all "dependency" element
         */
        void setDependencyArray(org.apache.maven.pom.x400.Dependency[] dependencyArray);
        
        /**
         * Sets ith "dependency" element
         */
        void setDependencyArray(int i, org.apache.maven.pom.x400.Dependency dependency);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dependency" element
         */
        org.apache.maven.pom.x400.Dependency insertNewDependency(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dependency" element
         */
        org.apache.maven.pom.x400.Dependency addNewDependency();
        
        /**
         * Removes the ith "dependency" element
         */
        void removeDependency(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Plugin.Dependencies newInstance() {
              return (org.apache.maven.pom.x400.Plugin.Dependencies) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Plugin.Dependencies newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Plugin.Dependencies) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML goals(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Goals extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Goals.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("goals6631elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Plugin.Goals newInstance() {
              return (org.apache.maven.pom.x400.Plugin.Goals) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Plugin.Goals newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Plugin.Goals) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML configuration(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Configuration extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Configuration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("configurationd73belemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Plugin.Configuration newInstance() {
              return (org.apache.maven.pom.x400.Plugin.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Plugin.Configuration newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Plugin.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.maven.pom.x400.Plugin newInstance() {
          return (org.apache.maven.pom.x400.Plugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.maven.pom.x400.Plugin newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.maven.pom.x400.Plugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.maven.pom.x400.Plugin parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Plugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.maven.pom.x400.Plugin parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Plugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.maven.pom.x400.Plugin parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Plugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.maven.pom.x400.Plugin parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Plugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.maven.pom.x400.Plugin parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Plugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.maven.pom.x400.Plugin parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Plugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.maven.pom.x400.Plugin parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Plugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.maven.pom.x400.Plugin parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Plugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.maven.pom.x400.Plugin parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Plugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.maven.pom.x400.Plugin parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Plugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.maven.pom.x400.Plugin parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Plugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.maven.pom.x400.Plugin parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Plugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.maven.pom.x400.Plugin parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Plugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.maven.pom.x400.Plugin parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Plugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.Plugin parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.Plugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.Plugin parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.Plugin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
