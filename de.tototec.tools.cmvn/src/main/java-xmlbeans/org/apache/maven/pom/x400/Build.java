/*
 * XML Type:  Build
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.Build
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400;


/**
 * An XML Build(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public interface Build extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Build.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("build5426type");
    
    /**
     * Gets the "sourceDirectory" element
     */
    java.lang.String getSourceDirectory();
    
    /**
     * Gets (as xml) the "sourceDirectory" element
     */
    org.apache.xmlbeans.XmlString xgetSourceDirectory();
    
    /**
     * True if has "sourceDirectory" element
     */
    boolean isSetSourceDirectory();
    
    /**
     * Sets the "sourceDirectory" element
     */
    void setSourceDirectory(java.lang.String sourceDirectory);
    
    /**
     * Sets (as xml) the "sourceDirectory" element
     */
    void xsetSourceDirectory(org.apache.xmlbeans.XmlString sourceDirectory);
    
    /**
     * Unsets the "sourceDirectory" element
     */
    void unsetSourceDirectory();
    
    /**
     * Gets the "scriptSourceDirectory" element
     */
    java.lang.String getScriptSourceDirectory();
    
    /**
     * Gets (as xml) the "scriptSourceDirectory" element
     */
    org.apache.xmlbeans.XmlString xgetScriptSourceDirectory();
    
    /**
     * True if has "scriptSourceDirectory" element
     */
    boolean isSetScriptSourceDirectory();
    
    /**
     * Sets the "scriptSourceDirectory" element
     */
    void setScriptSourceDirectory(java.lang.String scriptSourceDirectory);
    
    /**
     * Sets (as xml) the "scriptSourceDirectory" element
     */
    void xsetScriptSourceDirectory(org.apache.xmlbeans.XmlString scriptSourceDirectory);
    
    /**
     * Unsets the "scriptSourceDirectory" element
     */
    void unsetScriptSourceDirectory();
    
    /**
     * Gets the "testSourceDirectory" element
     */
    java.lang.String getTestSourceDirectory();
    
    /**
     * Gets (as xml) the "testSourceDirectory" element
     */
    org.apache.xmlbeans.XmlString xgetTestSourceDirectory();
    
    /**
     * True if has "testSourceDirectory" element
     */
    boolean isSetTestSourceDirectory();
    
    /**
     * Sets the "testSourceDirectory" element
     */
    void setTestSourceDirectory(java.lang.String testSourceDirectory);
    
    /**
     * Sets (as xml) the "testSourceDirectory" element
     */
    void xsetTestSourceDirectory(org.apache.xmlbeans.XmlString testSourceDirectory);
    
    /**
     * Unsets the "testSourceDirectory" element
     */
    void unsetTestSourceDirectory();
    
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
     * Gets the "testOutputDirectory" element
     */
    java.lang.String getTestOutputDirectory();
    
    /**
     * Gets (as xml) the "testOutputDirectory" element
     */
    org.apache.xmlbeans.XmlString xgetTestOutputDirectory();
    
    /**
     * True if has "testOutputDirectory" element
     */
    boolean isSetTestOutputDirectory();
    
    /**
     * Sets the "testOutputDirectory" element
     */
    void setTestOutputDirectory(java.lang.String testOutputDirectory);
    
    /**
     * Sets (as xml) the "testOutputDirectory" element
     */
    void xsetTestOutputDirectory(org.apache.xmlbeans.XmlString testOutputDirectory);
    
    /**
     * Unsets the "testOutputDirectory" element
     */
    void unsetTestOutputDirectory();
    
    /**
     * Gets the "extensions" element
     */
    org.apache.maven.pom.x400.Build.Extensions getExtensions();
    
    /**
     * True if has "extensions" element
     */
    boolean isSetExtensions();
    
    /**
     * Sets the "extensions" element
     */
    void setExtensions(org.apache.maven.pom.x400.Build.Extensions extensions);
    
    /**
     * Appends and returns a new empty "extensions" element
     */
    org.apache.maven.pom.x400.Build.Extensions addNewExtensions();
    
    /**
     * Unsets the "extensions" element
     */
    void unsetExtensions();
    
    /**
     * Gets the "defaultGoal" element
     */
    java.lang.String getDefaultGoal();
    
    /**
     * Gets (as xml) the "defaultGoal" element
     */
    org.apache.xmlbeans.XmlString xgetDefaultGoal();
    
    /**
     * True if has "defaultGoal" element
     */
    boolean isSetDefaultGoal();
    
    /**
     * Sets the "defaultGoal" element
     */
    void setDefaultGoal(java.lang.String defaultGoal);
    
    /**
     * Sets (as xml) the "defaultGoal" element
     */
    void xsetDefaultGoal(org.apache.xmlbeans.XmlString defaultGoal);
    
    /**
     * Unsets the "defaultGoal" element
     */
    void unsetDefaultGoal();
    
    /**
     * Gets the "resources" element
     */
    org.apache.maven.pom.x400.Build.Resources getResources();
    
    /**
     * True if has "resources" element
     */
    boolean isSetResources();
    
    /**
     * Sets the "resources" element
     */
    void setResources(org.apache.maven.pom.x400.Build.Resources resources);
    
    /**
     * Appends and returns a new empty "resources" element
     */
    org.apache.maven.pom.x400.Build.Resources addNewResources();
    
    /**
     * Unsets the "resources" element
     */
    void unsetResources();
    
    /**
     * Gets the "testResources" element
     */
    org.apache.maven.pom.x400.Build.TestResources getTestResources();
    
    /**
     * True if has "testResources" element
     */
    boolean isSetTestResources();
    
    /**
     * Sets the "testResources" element
     */
    void setTestResources(org.apache.maven.pom.x400.Build.TestResources testResources);
    
    /**
     * Appends and returns a new empty "testResources" element
     */
    org.apache.maven.pom.x400.Build.TestResources addNewTestResources();
    
    /**
     * Unsets the "testResources" element
     */
    void unsetTestResources();
    
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
     * Gets the "finalName" element
     */
    java.lang.String getFinalName();
    
    /**
     * Gets (as xml) the "finalName" element
     */
    org.apache.xmlbeans.XmlString xgetFinalName();
    
    /**
     * True if has "finalName" element
     */
    boolean isSetFinalName();
    
    /**
     * Sets the "finalName" element
     */
    void setFinalName(java.lang.String finalName);
    
    /**
     * Sets (as xml) the "finalName" element
     */
    void xsetFinalName(org.apache.xmlbeans.XmlString finalName);
    
    /**
     * Unsets the "finalName" element
     */
    void unsetFinalName();
    
    /**
     * Gets the "filters" element
     */
    org.apache.maven.pom.x400.Build.Filters getFilters();
    
    /**
     * True if has "filters" element
     */
    boolean isSetFilters();
    
    /**
     * Sets the "filters" element
     */
    void setFilters(org.apache.maven.pom.x400.Build.Filters filters);
    
    /**
     * Appends and returns a new empty "filters" element
     */
    org.apache.maven.pom.x400.Build.Filters addNewFilters();
    
    /**
     * Unsets the "filters" element
     */
    void unsetFilters();
    
    /**
     * Gets the "pluginManagement" element
     */
    org.apache.maven.pom.x400.PluginManagement getPluginManagement();
    
    /**
     * True if has "pluginManagement" element
     */
    boolean isSetPluginManagement();
    
    /**
     * Sets the "pluginManagement" element
     */
    void setPluginManagement(org.apache.maven.pom.x400.PluginManagement pluginManagement);
    
    /**
     * Appends and returns a new empty "pluginManagement" element
     */
    org.apache.maven.pom.x400.PluginManagement addNewPluginManagement();
    
    /**
     * Unsets the "pluginManagement" element
     */
    void unsetPluginManagement();
    
    /**
     * Gets the "plugins" element
     */
    org.apache.maven.pom.x400.Build.Plugins getPlugins();
    
    /**
     * True if has "plugins" element
     */
    boolean isSetPlugins();
    
    /**
     * Sets the "plugins" element
     */
    void setPlugins(org.apache.maven.pom.x400.Build.Plugins plugins);
    
    /**
     * Appends and returns a new empty "plugins" element
     */
    org.apache.maven.pom.x400.Build.Plugins addNewPlugins();
    
    /**
     * Unsets the "plugins" element
     */
    void unsetPlugins();
    
    /**
     * An XML extensions(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Extensions extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Extensions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("extensions8ed6elemtype");
        
        /**
         * Gets array of all "extension" elements
         */
        org.apache.maven.pom.x400.Extension[] getExtensionArray();
        
        /**
         * Gets ith "extension" element
         */
        org.apache.maven.pom.x400.Extension getExtensionArray(int i);
        
        /**
         * Returns number of "extension" element
         */
        int sizeOfExtensionArray();
        
        /**
         * Sets array of all "extension" element
         */
        void setExtensionArray(org.apache.maven.pom.x400.Extension[] extensionArray);
        
        /**
         * Sets ith "extension" element
         */
        void setExtensionArray(int i, org.apache.maven.pom.x400.Extension extension);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extension" element
         */
        org.apache.maven.pom.x400.Extension insertNewExtension(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extension" element
         */
        org.apache.maven.pom.x400.Extension addNewExtension();
        
        /**
         * Removes the ith "extension" element
         */
        void removeExtension(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Build.Extensions newInstance() {
              return (org.apache.maven.pom.x400.Build.Extensions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Build.Extensions newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Build.Extensions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML resources(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Resources extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Resources.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("resourcesef77elemtype");
        
        /**
         * Gets array of all "resource" elements
         */
        org.apache.maven.pom.x400.Resource[] getResourceArray();
        
        /**
         * Gets ith "resource" element
         */
        org.apache.maven.pom.x400.Resource getResourceArray(int i);
        
        /**
         * Returns number of "resource" element
         */
        int sizeOfResourceArray();
        
        /**
         * Sets array of all "resource" element
         */
        void setResourceArray(org.apache.maven.pom.x400.Resource[] resourceArray);
        
        /**
         * Sets ith "resource" element
         */
        void setResourceArray(int i, org.apache.maven.pom.x400.Resource resource);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resource" element
         */
        org.apache.maven.pom.x400.Resource insertNewResource(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resource" element
         */
        org.apache.maven.pom.x400.Resource addNewResource();
        
        /**
         * Removes the ith "resource" element
         */
        void removeResource(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Build.Resources newInstance() {
              return (org.apache.maven.pom.x400.Build.Resources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Build.Resources newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Build.Resources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML testResources(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface TestResources extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TestResources.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("testresources0985elemtype");
        
        /**
         * Gets array of all "testResource" elements
         */
        org.apache.maven.pom.x400.Resource[] getTestResourceArray();
        
        /**
         * Gets ith "testResource" element
         */
        org.apache.maven.pom.x400.Resource getTestResourceArray(int i);
        
        /**
         * Returns number of "testResource" element
         */
        int sizeOfTestResourceArray();
        
        /**
         * Sets array of all "testResource" element
         */
        void setTestResourceArray(org.apache.maven.pom.x400.Resource[] testResourceArray);
        
        /**
         * Sets ith "testResource" element
         */
        void setTestResourceArray(int i, org.apache.maven.pom.x400.Resource testResource);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "testResource" element
         */
        org.apache.maven.pom.x400.Resource insertNewTestResource(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "testResource" element
         */
        org.apache.maven.pom.x400.Resource addNewTestResource();
        
        /**
         * Removes the ith "testResource" element
         */
        void removeTestResource(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Build.TestResources newInstance() {
              return (org.apache.maven.pom.x400.Build.TestResources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Build.TestResources newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Build.TestResources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML filters(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Filters extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Filters.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("filters23cdelemtype");
        
        /**
         * Gets array of all "filter" elements
         */
        java.lang.String[] getFilterArray();
        
        /**
         * Gets ith "filter" element
         */
        java.lang.String getFilterArray(int i);
        
        /**
         * Gets (as xml) array of all "filter" elements
         */
        org.apache.xmlbeans.XmlString[] xgetFilterArray();
        
        /**
         * Gets (as xml) ith "filter" element
         */
        org.apache.xmlbeans.XmlString xgetFilterArray(int i);
        
        /**
         * Returns number of "filter" element
         */
        int sizeOfFilterArray();
        
        /**
         * Sets array of all "filter" element
         */
        void setFilterArray(java.lang.String[] filterArray);
        
        /**
         * Sets ith "filter" element
         */
        void setFilterArray(int i, java.lang.String filter);
        
        /**
         * Sets (as xml) array of all "filter" element
         */
        void xsetFilterArray(org.apache.xmlbeans.XmlString[] filterArray);
        
        /**
         * Sets (as xml) ith "filter" element
         */
        void xsetFilterArray(int i, org.apache.xmlbeans.XmlString filter);
        
        /**
         * Inserts the value as the ith "filter" element
         */
        void insertFilter(int i, java.lang.String filter);
        
        /**
         * Appends the value as the last "filter" element
         */
        void addFilter(java.lang.String filter);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "filter" element
         */
        org.apache.xmlbeans.XmlString insertNewFilter(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "filter" element
         */
        org.apache.xmlbeans.XmlString addNewFilter();
        
        /**
         * Removes the ith "filter" element
         */
        void removeFilter(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Build.Filters newInstance() {
              return (org.apache.maven.pom.x400.Build.Filters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Build.Filters newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Build.Filters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML plugins(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Plugins extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Plugins.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("plugins9932elemtype");
        
        /**
         * Gets array of all "plugin" elements
         */
        org.apache.maven.pom.x400.Plugin[] getPluginArray();
        
        /**
         * Gets ith "plugin" element
         */
        org.apache.maven.pom.x400.Plugin getPluginArray(int i);
        
        /**
         * Returns number of "plugin" element
         */
        int sizeOfPluginArray();
        
        /**
         * Sets array of all "plugin" element
         */
        void setPluginArray(org.apache.maven.pom.x400.Plugin[] pluginArray);
        
        /**
         * Sets ith "plugin" element
         */
        void setPluginArray(int i, org.apache.maven.pom.x400.Plugin plugin);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "plugin" element
         */
        org.apache.maven.pom.x400.Plugin insertNewPlugin(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "plugin" element
         */
        org.apache.maven.pom.x400.Plugin addNewPlugin();
        
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
            public static org.apache.maven.pom.x400.Build.Plugins newInstance() {
              return (org.apache.maven.pom.x400.Build.Plugins) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Build.Plugins newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Build.Plugins) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.maven.pom.x400.Build newInstance() {
          return (org.apache.maven.pom.x400.Build) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.maven.pom.x400.Build newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.maven.pom.x400.Build) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.maven.pom.x400.Build parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Build) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.maven.pom.x400.Build parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Build) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.maven.pom.x400.Build parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Build) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.maven.pom.x400.Build parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Build) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.maven.pom.x400.Build parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Build) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.maven.pom.x400.Build parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Build) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.maven.pom.x400.Build parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Build) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.maven.pom.x400.Build parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Build) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.maven.pom.x400.Build parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Build) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.maven.pom.x400.Build parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Build) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.maven.pom.x400.Build parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Build) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.maven.pom.x400.Build parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Build) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.maven.pom.x400.Build parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Build) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.maven.pom.x400.Build parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Build) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.Build parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.Build) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.Build parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.Build) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
