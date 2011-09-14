/*
 * XML Type:  Plugin
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.Plugin
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * An XML Plugin(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public class PluginImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Plugin
{
    private static final long serialVersionUID = 1L;
    
    public PluginImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPID$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "groupId");
    private static final javax.xml.namespace.QName ARTIFACTID$2 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "artifactId");
    private static final javax.xml.namespace.QName VERSION$4 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "version");
    private static final javax.xml.namespace.QName EXTENSIONS$6 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "extensions");
    private static final javax.xml.namespace.QName EXECUTIONS$8 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "executions");
    private static final javax.xml.namespace.QName DEPENDENCIES$10 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "dependencies");
    private static final javax.xml.namespace.QName GOALS$12 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "goals");
    private static final javax.xml.namespace.QName INHERITED$14 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "inherited");
    private static final javax.xml.namespace.QName CONFIGURATION$16 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "configuration");
    
    
    /**
     * Gets the "groupId" element
     */
    public java.lang.String getGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "groupId" element
     */
    public org.apache.xmlbeans.XmlString xgetGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "groupId" element
     */
    public boolean isSetGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUPID$0) != 0;
        }
    }
    
    /**
     * Sets the "groupId" element
     */
    public void setGroupId(java.lang.String groupId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUPID$0);
            }
            target.setStringValue(groupId);
        }
    }
    
    /**
     * Sets (as xml) the "groupId" element
     */
    public void xsetGroupId(org.apache.xmlbeans.XmlString groupId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GROUPID$0);
            }
            target.set(groupId);
        }
    }
    
    /**
     * Unsets the "groupId" element
     */
    public void unsetGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUPID$0, 0);
        }
    }
    
    /**
     * Gets the "artifactId" element
     */
    public java.lang.String getArtifactId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARTIFACTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "artifactId" element
     */
    public org.apache.xmlbeans.XmlString xgetArtifactId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARTIFACTID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "artifactId" element
     */
    public boolean isSetArtifactId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARTIFACTID$2) != 0;
        }
    }
    
    /**
     * Sets the "artifactId" element
     */
    public void setArtifactId(java.lang.String artifactId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARTIFACTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARTIFACTID$2);
            }
            target.setStringValue(artifactId);
        }
    }
    
    /**
     * Sets (as xml) the "artifactId" element
     */
    public void xsetArtifactId(org.apache.xmlbeans.XmlString artifactId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARTIFACTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARTIFACTID$2);
            }
            target.set(artifactId);
        }
    }
    
    /**
     * Unsets the "artifactId" element
     */
    public void unsetArtifactId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARTIFACTID$2, 0);
        }
    }
    
    /**
     * Gets the "version" element
     */
    public java.lang.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" element
     */
    public org.apache.xmlbeans.XmlString xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "version" element
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSION$4) != 0;
        }
    }
    
    /**
     * Sets the "version" element
     */
    public void setVersion(java.lang.String version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$4);
            }
            target.setStringValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" element
     */
    public void xsetVersion(org.apache.xmlbeans.XmlString version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$4);
            }
            target.set(version);
        }
    }
    
    /**
     * Unsets the "version" element
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSION$4, 0);
        }
    }
    
    /**
     * Gets the "extensions" element
     */
    public boolean getExtensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENSIONS$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "extensions" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetExtensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXTENSIONS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "extensions" element
     */
    public boolean isSetExtensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENSIONS$6) != 0;
        }
    }
    
    /**
     * Sets the "extensions" element
     */
    public void setExtensions(boolean extensions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENSIONS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTENSIONS$6);
            }
            target.setBooleanValue(extensions);
        }
    }
    
    /**
     * Sets (as xml) the "extensions" element
     */
    public void xsetExtensions(org.apache.xmlbeans.XmlBoolean extensions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXTENSIONS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(EXTENSIONS$6);
            }
            target.set(extensions);
        }
    }
    
    /**
     * Unsets the "extensions" element
     */
    public void unsetExtensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENSIONS$6, 0);
        }
    }
    
    /**
     * Gets the "executions" element
     */
    public org.apache.maven.pom.x400.Plugin.Executions getExecutions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Plugin.Executions target = null;
            target = (org.apache.maven.pom.x400.Plugin.Executions)get_store().find_element_user(EXECUTIONS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "executions" element
     */
    public boolean isSetExecutions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXECUTIONS$8) != 0;
        }
    }
    
    /**
     * Sets the "executions" element
     */
    public void setExecutions(org.apache.maven.pom.x400.Plugin.Executions executions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Plugin.Executions target = null;
            target = (org.apache.maven.pom.x400.Plugin.Executions)get_store().find_element_user(EXECUTIONS$8, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Plugin.Executions)get_store().add_element_user(EXECUTIONS$8);
            }
            target.set(executions);
        }
    }
    
    /**
     * Appends and returns a new empty "executions" element
     */
    public org.apache.maven.pom.x400.Plugin.Executions addNewExecutions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Plugin.Executions target = null;
            target = (org.apache.maven.pom.x400.Plugin.Executions)get_store().add_element_user(EXECUTIONS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "executions" element
     */
    public void unsetExecutions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXECUTIONS$8, 0);
        }
    }
    
    /**
     * Gets the "dependencies" element
     */
    public org.apache.maven.pom.x400.Plugin.Dependencies getDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Plugin.Dependencies target = null;
            target = (org.apache.maven.pom.x400.Plugin.Dependencies)get_store().find_element_user(DEPENDENCIES$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dependencies" element
     */
    public boolean isSetDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPENDENCIES$10) != 0;
        }
    }
    
    /**
     * Sets the "dependencies" element
     */
    public void setDependencies(org.apache.maven.pom.x400.Plugin.Dependencies dependencies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Plugin.Dependencies target = null;
            target = (org.apache.maven.pom.x400.Plugin.Dependencies)get_store().find_element_user(DEPENDENCIES$10, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Plugin.Dependencies)get_store().add_element_user(DEPENDENCIES$10);
            }
            target.set(dependencies);
        }
    }
    
    /**
     * Appends and returns a new empty "dependencies" element
     */
    public org.apache.maven.pom.x400.Plugin.Dependencies addNewDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Plugin.Dependencies target = null;
            target = (org.apache.maven.pom.x400.Plugin.Dependencies)get_store().add_element_user(DEPENDENCIES$10);
            return target;
        }
    }
    
    /**
     * Unsets the "dependencies" element
     */
    public void unsetDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPENDENCIES$10, 0);
        }
    }
    
    /**
     * Gets the "goals" element
     */
    public org.apache.maven.pom.x400.Plugin.Goals getGoals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Plugin.Goals target = null;
            target = (org.apache.maven.pom.x400.Plugin.Goals)get_store().find_element_user(GOALS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "goals" element
     */
    public boolean isSetGoals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GOALS$12) != 0;
        }
    }
    
    /**
     * Sets the "goals" element
     */
    public void setGoals(org.apache.maven.pom.x400.Plugin.Goals goals)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Plugin.Goals target = null;
            target = (org.apache.maven.pom.x400.Plugin.Goals)get_store().find_element_user(GOALS$12, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Plugin.Goals)get_store().add_element_user(GOALS$12);
            }
            target.set(goals);
        }
    }
    
    /**
     * Appends and returns a new empty "goals" element
     */
    public org.apache.maven.pom.x400.Plugin.Goals addNewGoals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Plugin.Goals target = null;
            target = (org.apache.maven.pom.x400.Plugin.Goals)get_store().add_element_user(GOALS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "goals" element
     */
    public void unsetGoals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GOALS$12, 0);
        }
    }
    
    /**
     * Gets the "inherited" element
     */
    public java.lang.String getInherited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INHERITED$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "inherited" element
     */
    public org.apache.xmlbeans.XmlString xgetInherited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INHERITED$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "inherited" element
     */
    public boolean isSetInherited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INHERITED$14) != 0;
        }
    }
    
    /**
     * Sets the "inherited" element
     */
    public void setInherited(java.lang.String inherited)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INHERITED$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INHERITED$14);
            }
            target.setStringValue(inherited);
        }
    }
    
    /**
     * Sets (as xml) the "inherited" element
     */
    public void xsetInherited(org.apache.xmlbeans.XmlString inherited)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INHERITED$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INHERITED$14);
            }
            target.set(inherited);
        }
    }
    
    /**
     * Unsets the "inherited" element
     */
    public void unsetInherited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INHERITED$14, 0);
        }
    }
    
    /**
     * Gets the "configuration" element
     */
    public org.apache.maven.pom.x400.Plugin.Configuration getConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Plugin.Configuration target = null;
            target = (org.apache.maven.pom.x400.Plugin.Configuration)get_store().find_element_user(CONFIGURATION$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "configuration" element
     */
    public boolean isSetConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIGURATION$16) != 0;
        }
    }
    
    /**
     * Sets the "configuration" element
     */
    public void setConfiguration(org.apache.maven.pom.x400.Plugin.Configuration configuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Plugin.Configuration target = null;
            target = (org.apache.maven.pom.x400.Plugin.Configuration)get_store().find_element_user(CONFIGURATION$16, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Plugin.Configuration)get_store().add_element_user(CONFIGURATION$16);
            }
            target.set(configuration);
        }
    }
    
    /**
     * Appends and returns a new empty "configuration" element
     */
    public org.apache.maven.pom.x400.Plugin.Configuration addNewConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Plugin.Configuration target = null;
            target = (org.apache.maven.pom.x400.Plugin.Configuration)get_store().add_element_user(CONFIGURATION$16);
            return target;
        }
    }
    
    /**
     * Unsets the "configuration" element
     */
    public void unsetConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIGURATION$16, 0);
        }
    }
    /**
     * An XML executions(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class ExecutionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Plugin.Executions
    {
        private static final long serialVersionUID = 1L;
        
        public ExecutionsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EXECUTION$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "execution");
        
        
        /**
         * Gets array of all "execution" elements
         */
        public org.apache.maven.pom.x400.PluginExecution[] getExecutionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXECUTION$0, targetList);
                org.apache.maven.pom.x400.PluginExecution[] result = new org.apache.maven.pom.x400.PluginExecution[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "execution" element
         */
        public org.apache.maven.pom.x400.PluginExecution getExecutionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.PluginExecution target = null;
                target = (org.apache.maven.pom.x400.PluginExecution)get_store().find_element_user(EXECUTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "execution" element
         */
        public int sizeOfExecutionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXECUTION$0);
            }
        }
        
        /**
         * Sets array of all "execution" element
         */
        public void setExecutionArray(org.apache.maven.pom.x400.PluginExecution[] executionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(executionArray, EXECUTION$0);
            }
        }
        
        /**
         * Sets ith "execution" element
         */
        public void setExecutionArray(int i, org.apache.maven.pom.x400.PluginExecution execution)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.PluginExecution target = null;
                target = (org.apache.maven.pom.x400.PluginExecution)get_store().find_element_user(EXECUTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(execution);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "execution" element
         */
        public org.apache.maven.pom.x400.PluginExecution insertNewExecution(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.PluginExecution target = null;
                target = (org.apache.maven.pom.x400.PluginExecution)get_store().insert_element_user(EXECUTION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "execution" element
         */
        public org.apache.maven.pom.x400.PluginExecution addNewExecution()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.PluginExecution target = null;
                target = (org.apache.maven.pom.x400.PluginExecution)get_store().add_element_user(EXECUTION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "execution" element
         */
        public void removeExecution(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXECUTION$0, i);
            }
        }
    }
    /**
     * An XML dependencies(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class DependenciesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Plugin.Dependencies
    {
        private static final long serialVersionUID = 1L;
        
        public DependenciesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DEPENDENCY$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "dependency");
        
        
        /**
         * Gets array of all "dependency" elements
         */
        public org.apache.maven.pom.x400.Dependency[] getDependencyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DEPENDENCY$0, targetList);
                org.apache.maven.pom.x400.Dependency[] result = new org.apache.maven.pom.x400.Dependency[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "dependency" element
         */
        public org.apache.maven.pom.x400.Dependency getDependencyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Dependency target = null;
                target = (org.apache.maven.pom.x400.Dependency)get_store().find_element_user(DEPENDENCY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "dependency" element
         */
        public int sizeOfDependencyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEPENDENCY$0);
            }
        }
        
        /**
         * Sets array of all "dependency" element
         */
        public void setDependencyArray(org.apache.maven.pom.x400.Dependency[] dependencyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(dependencyArray, DEPENDENCY$0);
            }
        }
        
        /**
         * Sets ith "dependency" element
         */
        public void setDependencyArray(int i, org.apache.maven.pom.x400.Dependency dependency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Dependency target = null;
                target = (org.apache.maven.pom.x400.Dependency)get_store().find_element_user(DEPENDENCY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(dependency);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dependency" element
         */
        public org.apache.maven.pom.x400.Dependency insertNewDependency(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Dependency target = null;
                target = (org.apache.maven.pom.x400.Dependency)get_store().insert_element_user(DEPENDENCY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dependency" element
         */
        public org.apache.maven.pom.x400.Dependency addNewDependency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Dependency target = null;
                target = (org.apache.maven.pom.x400.Dependency)get_store().add_element_user(DEPENDENCY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "dependency" element
         */
        public void removeDependency(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEPENDENCY$0, i);
            }
        }
    }
    /**
     * An XML goals(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class GoalsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Plugin.Goals
    {
        private static final long serialVersionUID = 1L;
        
        public GoalsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
    /**
     * An XML configuration(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class ConfigurationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Plugin.Configuration
    {
        private static final long serialVersionUID = 1L;
        
        public ConfigurationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
