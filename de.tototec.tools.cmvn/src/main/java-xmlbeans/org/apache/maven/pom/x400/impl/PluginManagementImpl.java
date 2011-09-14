/*
 * XML Type:  PluginManagement
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.PluginManagement
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * An XML PluginManagement(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public class PluginManagementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.PluginManagement
{
    private static final long serialVersionUID = 1L;
    
    public PluginManagementImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PLUGINS$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "plugins");
    
    
    /**
     * Gets the "plugins" element
     */
    public org.apache.maven.pom.x400.PluginManagement.Plugins getPlugins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.PluginManagement.Plugins target = null;
            target = (org.apache.maven.pom.x400.PluginManagement.Plugins)get_store().find_element_user(PLUGINS$0, 0);
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
            return get_store().count_elements(PLUGINS$0) != 0;
        }
    }
    
    /**
     * Sets the "plugins" element
     */
    public void setPlugins(org.apache.maven.pom.x400.PluginManagement.Plugins plugins)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.PluginManagement.Plugins target = null;
            target = (org.apache.maven.pom.x400.PluginManagement.Plugins)get_store().find_element_user(PLUGINS$0, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.PluginManagement.Plugins)get_store().add_element_user(PLUGINS$0);
            }
            target.set(plugins);
        }
    }
    
    /**
     * Appends and returns a new empty "plugins" element
     */
    public org.apache.maven.pom.x400.PluginManagement.Plugins addNewPlugins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.PluginManagement.Plugins target = null;
            target = (org.apache.maven.pom.x400.PluginManagement.Plugins)get_store().add_element_user(PLUGINS$0);
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
            get_store().remove_element(PLUGINS$0, 0);
        }
    }
    /**
     * An XML plugins(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class PluginsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.PluginManagement.Plugins
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
        public org.apache.maven.pom.x400.Plugin[] getPluginArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PLUGIN$0, targetList);
                org.apache.maven.pom.x400.Plugin[] result = new org.apache.maven.pom.x400.Plugin[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "plugin" element
         */
        public org.apache.maven.pom.x400.Plugin getPluginArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Plugin target = null;
                target = (org.apache.maven.pom.x400.Plugin)get_store().find_element_user(PLUGIN$0, i);
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
        public void setPluginArray(org.apache.maven.pom.x400.Plugin[] pluginArray)
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
        public void setPluginArray(int i, org.apache.maven.pom.x400.Plugin plugin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Plugin target = null;
                target = (org.apache.maven.pom.x400.Plugin)get_store().find_element_user(PLUGIN$0, i);
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
        public org.apache.maven.pom.x400.Plugin insertNewPlugin(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Plugin target = null;
                target = (org.apache.maven.pom.x400.Plugin)get_store().insert_element_user(PLUGIN$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "plugin" element
         */
        public org.apache.maven.pom.x400.Plugin addNewPlugin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Plugin target = null;
                target = (org.apache.maven.pom.x400.Plugin)get_store().add_element_user(PLUGIN$0);
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
