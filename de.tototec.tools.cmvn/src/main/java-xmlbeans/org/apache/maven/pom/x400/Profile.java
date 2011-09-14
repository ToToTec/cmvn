/*
 * XML Type:  Profile
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.Profile
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400;


/**
 * An XML Profile(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public interface Profile extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Profile.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("profile8ee1type");
    
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
     * Gets the "activation" element
     */
    org.apache.maven.pom.x400.Activation getActivation();
    
    /**
     * True if has "activation" element
     */
    boolean isSetActivation();
    
    /**
     * Sets the "activation" element
     */
    void setActivation(org.apache.maven.pom.x400.Activation activation);
    
    /**
     * Appends and returns a new empty "activation" element
     */
    org.apache.maven.pom.x400.Activation addNewActivation();
    
    /**
     * Unsets the "activation" element
     */
    void unsetActivation();
    
    /**
     * Gets the "build" element
     */
    org.apache.maven.pom.x400.BuildBase getBuild();
    
    /**
     * True if has "build" element
     */
    boolean isSetBuild();
    
    /**
     * Sets the "build" element
     */
    void setBuild(org.apache.maven.pom.x400.BuildBase build);
    
    /**
     * Appends and returns a new empty "build" element
     */
    org.apache.maven.pom.x400.BuildBase addNewBuild();
    
    /**
     * Unsets the "build" element
     */
    void unsetBuild();
    
    /**
     * Gets the "modules" element
     */
    org.apache.maven.pom.x400.Profile.Modules getModules();
    
    /**
     * True if has "modules" element
     */
    boolean isSetModules();
    
    /**
     * Sets the "modules" element
     */
    void setModules(org.apache.maven.pom.x400.Profile.Modules modules);
    
    /**
     * Appends and returns a new empty "modules" element
     */
    org.apache.maven.pom.x400.Profile.Modules addNewModules();
    
    /**
     * Unsets the "modules" element
     */
    void unsetModules();
    
    /**
     * Gets the "repositories" element
     */
    org.apache.maven.pom.x400.Profile.Repositories getRepositories();
    
    /**
     * True if has "repositories" element
     */
    boolean isSetRepositories();
    
    /**
     * Sets the "repositories" element
     */
    void setRepositories(org.apache.maven.pom.x400.Profile.Repositories repositories);
    
    /**
     * Appends and returns a new empty "repositories" element
     */
    org.apache.maven.pom.x400.Profile.Repositories addNewRepositories();
    
    /**
     * Unsets the "repositories" element
     */
    void unsetRepositories();
    
    /**
     * Gets the "pluginRepositories" element
     */
    org.apache.maven.pom.x400.Profile.PluginRepositories getPluginRepositories();
    
    /**
     * True if has "pluginRepositories" element
     */
    boolean isSetPluginRepositories();
    
    /**
     * Sets the "pluginRepositories" element
     */
    void setPluginRepositories(org.apache.maven.pom.x400.Profile.PluginRepositories pluginRepositories);
    
    /**
     * Appends and returns a new empty "pluginRepositories" element
     */
    org.apache.maven.pom.x400.Profile.PluginRepositories addNewPluginRepositories();
    
    /**
     * Unsets the "pluginRepositories" element
     */
    void unsetPluginRepositories();
    
    /**
     * Gets the "dependencies" element
     */
    org.apache.maven.pom.x400.Profile.Dependencies getDependencies();
    
    /**
     * True if has "dependencies" element
     */
    boolean isSetDependencies();
    
    /**
     * Sets the "dependencies" element
     */
    void setDependencies(org.apache.maven.pom.x400.Profile.Dependencies dependencies);
    
    /**
     * Appends and returns a new empty "dependencies" element
     */
    org.apache.maven.pom.x400.Profile.Dependencies addNewDependencies();
    
    /**
     * Unsets the "dependencies" element
     */
    void unsetDependencies();
    
    /**
     * Gets the "reports" element
     */
    org.apache.maven.pom.x400.Profile.Reports getReports();
    
    /**
     * True if has "reports" element
     */
    boolean isSetReports();
    
    /**
     * Sets the "reports" element
     */
    void setReports(org.apache.maven.pom.x400.Profile.Reports reports);
    
    /**
     * Appends and returns a new empty "reports" element
     */
    org.apache.maven.pom.x400.Profile.Reports addNewReports();
    
    /**
     * Unsets the "reports" element
     */
    void unsetReports();
    
    /**
     * Gets the "reporting" element
     */
    org.apache.maven.pom.x400.Reporting getReporting();
    
    /**
     * True if has "reporting" element
     */
    boolean isSetReporting();
    
    /**
     * Sets the "reporting" element
     */
    void setReporting(org.apache.maven.pom.x400.Reporting reporting);
    
    /**
     * Appends and returns a new empty "reporting" element
     */
    org.apache.maven.pom.x400.Reporting addNewReporting();
    
    /**
     * Unsets the "reporting" element
     */
    void unsetReporting();
    
    /**
     * Gets the "dependencyManagement" element
     */
    org.apache.maven.pom.x400.DependencyManagement getDependencyManagement();
    
    /**
     * True if has "dependencyManagement" element
     */
    boolean isSetDependencyManagement();
    
    /**
     * Sets the "dependencyManagement" element
     */
    void setDependencyManagement(org.apache.maven.pom.x400.DependencyManagement dependencyManagement);
    
    /**
     * Appends and returns a new empty "dependencyManagement" element
     */
    org.apache.maven.pom.x400.DependencyManagement addNewDependencyManagement();
    
    /**
     * Unsets the "dependencyManagement" element
     */
    void unsetDependencyManagement();
    
    /**
     * Gets the "distributionManagement" element
     */
    org.apache.maven.pom.x400.DistributionManagement getDistributionManagement();
    
    /**
     * True if has "distributionManagement" element
     */
    boolean isSetDistributionManagement();
    
    /**
     * Sets the "distributionManagement" element
     */
    void setDistributionManagement(org.apache.maven.pom.x400.DistributionManagement distributionManagement);
    
    /**
     * Appends and returns a new empty "distributionManagement" element
     */
    org.apache.maven.pom.x400.DistributionManagement addNewDistributionManagement();
    
    /**
     * Unsets the "distributionManagement" element
     */
    void unsetDistributionManagement();
    
    /**
     * Gets the "properties" element
     */
    org.apache.maven.pom.x400.Profile.Properties getProperties();
    
    /**
     * True if has "properties" element
     */
    boolean isSetProperties();
    
    /**
     * Sets the "properties" element
     */
    void setProperties(org.apache.maven.pom.x400.Profile.Properties properties);
    
    /**
     * Appends and returns a new empty "properties" element
     */
    org.apache.maven.pom.x400.Profile.Properties addNewProperties();
    
    /**
     * Unsets the "properties" element
     */
    void unsetProperties();
    
    /**
     * An XML modules(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Modules extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Modules.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("modules7254elemtype");
        
        /**
         * Gets array of all "module" elements
         */
        java.lang.String[] getModuleArray();
        
        /**
         * Gets ith "module" element
         */
        java.lang.String getModuleArray(int i);
        
        /**
         * Gets (as xml) array of all "module" elements
         */
        org.apache.xmlbeans.XmlString[] xgetModuleArray();
        
        /**
         * Gets (as xml) ith "module" element
         */
        org.apache.xmlbeans.XmlString xgetModuleArray(int i);
        
        /**
         * Returns number of "module" element
         */
        int sizeOfModuleArray();
        
        /**
         * Sets array of all "module" element
         */
        void setModuleArray(java.lang.String[] moduleArray);
        
        /**
         * Sets ith "module" element
         */
        void setModuleArray(int i, java.lang.String module);
        
        /**
         * Sets (as xml) array of all "module" element
         */
        void xsetModuleArray(org.apache.xmlbeans.XmlString[] moduleArray);
        
        /**
         * Sets (as xml) ith "module" element
         */
        void xsetModuleArray(int i, org.apache.xmlbeans.XmlString module);
        
        /**
         * Inserts the value as the ith "module" element
         */
        void insertModule(int i, java.lang.String module);
        
        /**
         * Appends the value as the last "module" element
         */
        void addModule(java.lang.String module);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "module" element
         */
        org.apache.xmlbeans.XmlString insertNewModule(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "module" element
         */
        org.apache.xmlbeans.XmlString addNewModule();
        
        /**
         * Removes the ith "module" element
         */
        void removeModule(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Profile.Modules newInstance() {
              return (org.apache.maven.pom.x400.Profile.Modules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Profile.Modules newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Profile.Modules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML repositories(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Repositories extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Repositories.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("repositories7ee5elemtype");
        
        /**
         * Gets array of all "repository" elements
         */
        org.apache.maven.pom.x400.Repository[] getRepositoryArray();
        
        /**
         * Gets ith "repository" element
         */
        org.apache.maven.pom.x400.Repository getRepositoryArray(int i);
        
        /**
         * Returns number of "repository" element
         */
        int sizeOfRepositoryArray();
        
        /**
         * Sets array of all "repository" element
         */
        void setRepositoryArray(org.apache.maven.pom.x400.Repository[] repositoryArray);
        
        /**
         * Sets ith "repository" element
         */
        void setRepositoryArray(int i, org.apache.maven.pom.x400.Repository repository);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "repository" element
         */
        org.apache.maven.pom.x400.Repository insertNewRepository(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "repository" element
         */
        org.apache.maven.pom.x400.Repository addNewRepository();
        
        /**
         * Removes the ith "repository" element
         */
        void removeRepository(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Profile.Repositories newInstance() {
              return (org.apache.maven.pom.x400.Profile.Repositories) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Profile.Repositories newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Profile.Repositories) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML pluginRepositories(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface PluginRepositories extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PluginRepositories.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("pluginrepositories8b38elemtype");
        
        /**
         * Gets array of all "pluginRepository" elements
         */
        org.apache.maven.pom.x400.Repository[] getPluginRepositoryArray();
        
        /**
         * Gets ith "pluginRepository" element
         */
        org.apache.maven.pom.x400.Repository getPluginRepositoryArray(int i);
        
        /**
         * Returns number of "pluginRepository" element
         */
        int sizeOfPluginRepositoryArray();
        
        /**
         * Sets array of all "pluginRepository" element
         */
        void setPluginRepositoryArray(org.apache.maven.pom.x400.Repository[] pluginRepositoryArray);
        
        /**
         * Sets ith "pluginRepository" element
         */
        void setPluginRepositoryArray(int i, org.apache.maven.pom.x400.Repository pluginRepository);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "pluginRepository" element
         */
        org.apache.maven.pom.x400.Repository insertNewPluginRepository(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "pluginRepository" element
         */
        org.apache.maven.pom.x400.Repository addNewPluginRepository();
        
        /**
         * Removes the ith "pluginRepository" element
         */
        void removePluginRepository(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Profile.PluginRepositories newInstance() {
              return (org.apache.maven.pom.x400.Profile.PluginRepositories) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Profile.PluginRepositories newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Profile.PluginRepositories) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Dependencies.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("dependencies9d26elemtype");
        
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
            public static org.apache.maven.pom.x400.Profile.Dependencies newInstance() {
              return (org.apache.maven.pom.x400.Profile.Dependencies) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Profile.Dependencies newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Profile.Dependencies) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Reports.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("reports288celemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Profile.Reports newInstance() {
              return (org.apache.maven.pom.x400.Profile.Reports) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Profile.Reports newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Profile.Reports) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML properties(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Properties extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Properties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("properties0c30elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Profile.Properties newInstance() {
              return (org.apache.maven.pom.x400.Profile.Properties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Profile.Properties newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Profile.Properties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.maven.pom.x400.Profile newInstance() {
          return (org.apache.maven.pom.x400.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.maven.pom.x400.Profile newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.maven.pom.x400.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.maven.pom.x400.Profile parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.maven.pom.x400.Profile parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.maven.pom.x400.Profile parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.maven.pom.x400.Profile parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.maven.pom.x400.Profile parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.maven.pom.x400.Profile parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.maven.pom.x400.Profile parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.maven.pom.x400.Profile parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.maven.pom.x400.Profile parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.maven.pom.x400.Profile parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.maven.pom.x400.Profile parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.maven.pom.x400.Profile parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.maven.pom.x400.Profile parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.maven.pom.x400.Profile parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.Profile parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.Profile parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
