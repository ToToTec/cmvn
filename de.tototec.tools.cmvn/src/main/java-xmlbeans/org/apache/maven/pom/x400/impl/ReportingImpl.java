/*
 * XML Type:  Reporting
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.Reporting
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * An XML Reporting(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public class ReportingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Reporting
{
    private static final long serialVersionUID = 1L;
    
    public ReportingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXCLUDEDEFAULTS$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "excludeDefaults");
    private static final javax.xml.namespace.QName OUTPUTDIRECTORY$2 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "outputDirectory");
    private static final javax.xml.namespace.QName PLUGINS$4 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "plugins");
    
    
    /**
     * Gets the "excludeDefaults" element
     */
    public boolean getExcludeDefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCLUDEDEFAULTS$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "excludeDefaults" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetExcludeDefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXCLUDEDEFAULTS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "excludeDefaults" element
     */
    public boolean isSetExcludeDefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXCLUDEDEFAULTS$0) != 0;
        }
    }
    
    /**
     * Sets the "excludeDefaults" element
     */
    public void setExcludeDefaults(boolean excludeDefaults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCLUDEDEFAULTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXCLUDEDEFAULTS$0);
            }
            target.setBooleanValue(excludeDefaults);
        }
    }
    
    /**
     * Sets (as xml) the "excludeDefaults" element
     */
    public void xsetExcludeDefaults(org.apache.xmlbeans.XmlBoolean excludeDefaults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXCLUDEDEFAULTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(EXCLUDEDEFAULTS$0);
            }
            target.set(excludeDefaults);
        }
    }
    
    /**
     * Unsets the "excludeDefaults" element
     */
    public void unsetExcludeDefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXCLUDEDEFAULTS$0, 0);
        }
    }
    
    /**
     * Gets the "outputDirectory" element
     */
    public java.lang.String getOutputDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTPUTDIRECTORY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "outputDirectory" element
     */
    public org.apache.xmlbeans.XmlString xgetOutputDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUTPUTDIRECTORY$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "outputDirectory" element
     */
    public boolean isSetOutputDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTPUTDIRECTORY$2) != 0;
        }
    }
    
    /**
     * Sets the "outputDirectory" element
     */
    public void setOutputDirectory(java.lang.String outputDirectory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTPUTDIRECTORY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OUTPUTDIRECTORY$2);
            }
            target.setStringValue(outputDirectory);
        }
    }
    
    /**
     * Sets (as xml) the "outputDirectory" element
     */
    public void xsetOutputDirectory(org.apache.xmlbeans.XmlString outputDirectory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUTPUTDIRECTORY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OUTPUTDIRECTORY$2);
            }
            target.set(outputDirectory);
        }
    }
    
    /**
     * Unsets the "outputDirectory" element
     */
    public void unsetOutputDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTPUTDIRECTORY$2, 0);
        }
    }
    
    /**
     * Gets the "plugins" element
     */
    public org.apache.maven.pom.x400.Reporting.Plugins getPlugins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Reporting.Plugins target = null;
            target = (org.apache.maven.pom.x400.Reporting.Plugins)get_store().find_element_user(PLUGINS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "plugins" element
     */
    public boolean isSetPlugins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLUGINS$4) != 0;
        }
    }
    
    /**
     * Sets the "plugins" element
     */
    public void setPlugins(org.apache.maven.pom.x400.Reporting.Plugins plugins)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Reporting.Plugins target = null;
            target = (org.apache.maven.pom.x400.Reporting.Plugins)get_store().find_element_user(PLUGINS$4, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Reporting.Plugins)get_store().add_element_user(PLUGINS$4);
            }
            target.set(plugins);
        }
    }
    
    /**
     * Appends and returns a new empty "plugins" element
     */
    public org.apache.maven.pom.x400.Reporting.Plugins addNewPlugins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Reporting.Plugins target = null;
            target = (org.apache.maven.pom.x400.Reporting.Plugins)get_store().add_element_user(PLUGINS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "plugins" element
     */
    public void unsetPlugins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLUGINS$4, 0);
        }
    }
    /**
     * An XML plugins(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class PluginsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Reporting.Plugins
    {
        private static final long serialVersionUID = 1L;
        
        public PluginsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PLUGIN$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "plugin");
        
        
        /**
         * Gets array of all "plugin" elements
         */
        public org.apache.maven.pom.x400.ReportPlugin[] getPluginArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PLUGIN$0, targetList);
                org.apache.maven.pom.x400.ReportPlugin[] result = new org.apache.maven.pom.x400.ReportPlugin[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "plugin" element
         */
        public org.apache.maven.pom.x400.ReportPlugin getPluginArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.ReportPlugin target = null;
                target = (org.apache.maven.pom.x400.ReportPlugin)get_store().find_element_user(PLUGIN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "plugin" element
         */
        public int sizeOfPluginArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PLUGIN$0);
            }
        }
        
        /**
         * Sets array of all "plugin" element
         */
        public void setPluginArray(org.apache.maven.pom.x400.ReportPlugin[] pluginArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pluginArray, PLUGIN$0);
            }
        }
        
        /**
         * Sets ith "plugin" element
         */
        public void setPluginArray(int i, org.apache.maven.pom.x400.ReportPlugin plugin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.ReportPlugin target = null;
                target = (org.apache.maven.pom.x400.ReportPlugin)get_store().find_element_user(PLUGIN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(plugin);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "plugin" element
         */
        public org.apache.maven.pom.x400.ReportPlugin insertNewPlugin(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.ReportPlugin target = null;
                target = (org.apache.maven.pom.x400.ReportPlugin)get_store().insert_element_user(PLUGIN$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "plugin" element
         */
        public org.apache.maven.pom.x400.ReportPlugin addNewPlugin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.ReportPlugin target = null;
                target = (org.apache.maven.pom.x400.ReportPlugin)get_store().add_element_user(PLUGIN$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "plugin" element
         */
        public void removePlugin(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PLUGIN$0, i);
            }
        }
    }
}
