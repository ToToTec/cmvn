/*
 * XML Type:  Profile
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.Profile
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * An XML Profile(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public class ProfileImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Profile
{
    private static final long serialVersionUID = 1L;
    
    public ProfileImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "id");
    private static final javax.xml.namespace.QName ACTIVATION$2 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "activation");
    private static final javax.xml.namespace.QName BUILD$4 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "build");
    private static final javax.xml.namespace.QName MODULES$6 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "modules");
    private static final javax.xml.namespace.QName REPOSITORIES$8 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "repositories");
    private static final javax.xml.namespace.QName PLUGINREPOSITORIES$10 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "pluginRepositories");
    private static final javax.xml.namespace.QName DEPENDENCIES$12 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "dependencies");
    private static final javax.xml.namespace.QName REPORTS$14 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "reports");
    private static final javax.xml.namespace.QName REPORTING$16 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "reporting");
    private static final javax.xml.namespace.QName DEPENDENCYMANAGEMENT$18 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "dependencyManagement");
    private static final javax.xml.namespace.QName DISTRIBUTIONMANAGEMENT$20 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "distributionManagement");
    private static final javax.xml.namespace.QName PROPERTIES$22 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "properties");
    
    
    /**
     * Gets the "id" element
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" element
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "id" element
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$0) != 0;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" element
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" element
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$0, 0);
        }
    }
    
    /**
     * Gets the "activation" element
     */
    public org.apache.maven.pom.x400.Activation getActivation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Activation target = null;
            target = (org.apache.maven.pom.x400.Activation)get_store().find_element_user(ACTIVATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "activation" element
     */
    public boolean isSetActivation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVATION$2) != 0;
        }
    }
    
    /**
     * Sets the "activation" element
     */
    public void setActivation(org.apache.maven.pom.x400.Activation activation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Activation target = null;
            target = (org.apache.maven.pom.x400.Activation)get_store().find_element_user(ACTIVATION$2, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Activation)get_store().add_element_user(ACTIVATION$2);
            }
            target.set(activation);
        }
    }
    
    /**
     * Appends and returns a new empty "activation" element
     */
    public org.apache.maven.pom.x400.Activation addNewActivation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Activation target = null;
            target = (org.apache.maven.pom.x400.Activation)get_store().add_element_user(ACTIVATION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "activation" element
     */
    public void unsetActivation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVATION$2, 0);
        }
    }
    
    /**
     * Gets the "build" element
     */
    public org.apache.maven.pom.x400.BuildBase getBuild()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.BuildBase target = null;
            target = (org.apache.maven.pom.x400.BuildBase)get_store().find_element_user(BUILD$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "build" element
     */
    public boolean isSetBuild()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUILD$4) != 0;
        }
    }
    
    /**
     * Sets the "build" element
     */
    public void setBuild(org.apache.maven.pom.x400.BuildBase build)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.BuildBase target = null;
            target = (org.apache.maven.pom.x400.BuildBase)get_store().find_element_user(BUILD$4, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.BuildBase)get_store().add_element_user(BUILD$4);
            }
            target.set(build);
        }
    }
    
    /**
     * Appends and returns a new empty "build" element
     */
    public org.apache.maven.pom.x400.BuildBase addNewBuild()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.BuildBase target = null;
            target = (org.apache.maven.pom.x400.BuildBase)get_store().add_element_user(BUILD$4);
            return target;
        }
    }
    
    /**
     * Unsets the "build" element
     */
    public void unsetBuild()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUILD$4, 0);
        }
    }
    
    /**
     * Gets the "modules" element
     */
    public org.apache.maven.pom.x400.Profile.Modules getModules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Profile.Modules target = null;
            target = (org.apache.maven.pom.x400.Profile.Modules)get_store().find_element_user(MODULES$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "modules" element
     */
    public boolean isSetModules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODULES$6) != 0;
        }
    }
    
    /**
     * Sets the "modules" element
     */
    public void setModules(org.apache.maven.pom.x400.Profile.Modules modules)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Profile.Modules target = null;
            target = (org.apache.maven.pom.x400.Profile.Modules)get_store().find_element_user(MODULES$6, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Profile.Modules)get_store().add_element_user(MODULES$6);
            }
            target.set(modules);
        }
    }
    
    /**
     * Appends and returns a new empty "modules" element
     */
    public org.apache.maven.pom.x400.Profile.Modules addNewModules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Profile.Modules target = null;
            target = (org.apache.maven.pom.x400.Profile.Modules)get_store().add_element_user(MODULES$6);
            return target;
        }
    }
    
    /**
     * Unsets the "modules" element
     */
    public void unsetModules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODULES$6, 0);
        }
    }
    
    /**
     * Gets the "repositories" element
     */
    public org.apache.maven.pom.x400.Profile.Repositories getRepositories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Profile.Repositories target = null;
            target = (org.apache.maven.pom.x400.Profile.Repositories)get_store().find_element_user(REPOSITORIES$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "repositories" element
     */
    public boolean isSetRepositories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPOSITORIES$8) != 0;
        }
    }
    
    /**
     * Sets the "repositories" element
     */
    public void setRepositories(org.apache.maven.pom.x400.Profile.Repositories repositories)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Profile.Repositories target = null;
            target = (org.apache.maven.pom.x400.Profile.Repositories)get_store().find_element_user(REPOSITORIES$8, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Profile.Repositories)get_store().add_element_user(REPOSITORIES$8);
            }
            target.set(repositories);
        }
    }
    
    /**
     * Appends and returns a new empty "repositories" element
     */
    public org.apache.maven.pom.x400.Profile.Repositories addNewRepositories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Profile.Repositories target = null;
            target = (org.apache.maven.pom.x400.Profile.Repositories)get_store().add_element_user(REPOSITORIES$8);
            return target;
        }
    }
    
    /**
     * Unsets the "repositories" element
     */
    public void unsetRepositories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPOSITORIES$8, 0);
        }
    }
    
    /**
     * Gets the "pluginRepositories" element
     */
    public org.apache.maven.pom.x400.Profile.PluginRepositories getPluginRepositories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Profile.PluginRepositories target = null;
            target = (org.apache.maven.pom.x400.Profile.PluginRepositories)get_store().find_element_user(PLUGINREPOSITORIES$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pluginRepositories" element
     */
    public boolean isSetPluginRepositories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLUGINREPOSITORIES$10) != 0;
        }
    }
    
    /**
     * Sets the "pluginRepositories" element
     */
    public void setPluginRepositories(org.apache.maven.pom.x400.Profile.PluginRepositories pluginRepositories)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Profile.PluginRepositories target = null;
            target = (org.apache.maven.pom.x400.Profile.PluginRepositories)get_store().find_element_user(PLUGINREPOSITORIES$10, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Profile.PluginRepositories)get_store().add_element_user(PLUGINREPOSITORIES$10);
            }
            target.set(pluginRepositories);
        }
    }
    
    /**
     * Appends and returns a new empty "pluginRepositories" element
     */
    public org.apache.maven.pom.x400.Profile.PluginRepositories addNewPluginRepositories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Profile.PluginRepositories target = null;
            target = (org.apache.maven.pom.x400.Profile.PluginRepositories)get_store().add_element_user(PLUGINREPOSITORIES$10);
            return target;
        }
    }
    
    /**
     * Unsets the "pluginRepositories" element
     */
    public void unsetPluginRepositories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLUGINREPOSITORIES$10, 0);
        }
    }
    
    /**
     * Gets the "dependencies" element
     */
    public org.apache.maven.pom.x400.Profile.Dependencies getDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Profile.Dependencies target = null;
            target = (org.apache.maven.pom.x400.Profile.Dependencies)get_store().find_element_user(DEPENDENCIES$12, 0);
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
            return get_store().count_elements(DEPENDENCIES$12) != 0;
        }
    }
    
    /**
     * Sets the "dependencies" element
     */
    public void setDependencies(org.apache.maven.pom.x400.Profile.Dependencies dependencies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Profile.Dependencies target = null;
            target = (org.apache.maven.pom.x400.Profile.Dependencies)get_store().find_element_user(DEPENDENCIES$12, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Profile.Dependencies)get_store().add_element_user(DEPENDENCIES$12);
            }
            target.set(dependencies);
        }
    }
    
    /**
     * Appends and returns a new empty "dependencies" element
     */
    public org.apache.maven.pom.x400.Profile.Dependencies addNewDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Profile.Dependencies target = null;
            target = (org.apache.maven.pom.x400.Profile.Dependencies)get_store().add_element_user(DEPENDENCIES$12);
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
            get_store().remove_element(DEPENDENCIES$12, 0);
        }
    }
    
    /**
     * Gets the "reports" element
     */
    public org.apache.maven.pom.x400.Profile.Reports getReports()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Profile.Reports target = null;
            target = (org.apache.maven.pom.x400.Profile.Reports)get_store().find_element_user(REPORTS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reports" element
     */
    public boolean isSetReports()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTS$14) != 0;
        }
    }
    
    /**
     * Sets the "reports" element
     */
    public void setReports(org.apache.maven.pom.x400.Profile.Reports reports)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Profile.Reports target = null;
            target = (org.apache.maven.pom.x400.Profile.Reports)get_store().find_element_user(REPORTS$14, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Profile.Reports)get_store().add_element_user(REPORTS$14);
            }
            target.set(reports);
        }
    }
    
    /**
     * Appends and returns a new empty "reports" element
     */
    public org.apache.maven.pom.x400.Profile.Reports addNewReports()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Profile.Reports target = null;
            target = (org.apache.maven.pom.x400.Profile.Reports)get_store().add_element_user(REPORTS$14);
            return target;
        }
    }
    
    /**
     * Unsets the "reports" element
     */
    public void unsetReports()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTS$14, 0);
        }
    }
    
    /**
     * Gets the "reporting" element
     */
    public org.apache.maven.pom.x400.Reporting getReporting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Reporting target = null;
            target = (org.apache.maven.pom.x400.Reporting)get_store().find_element_user(REPORTING$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reporting" element
     */
    public boolean isSetReporting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTING$16) != 0;
        }
    }
    
    /**
     * Sets the "reporting" element
     */
    public void setReporting(org.apache.maven.pom.x400.Reporting reporting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Reporting target = null;
            target = (org.apache.maven.pom.x400.Reporting)get_store().find_element_user(REPORTING$16, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Reporting)get_store().add_element_user(REPORTING$16);
            }
            target.set(reporting);
        }
    }
    
    /**
     * Appends and returns a new empty "reporting" element
     */
    public org.apache.maven.pom.x400.Reporting addNewReporting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Reporting target = null;
            target = (org.apache.maven.pom.x400.Reporting)get_store().add_element_user(REPORTING$16);
            return target;
        }
    }
    
    /**
     * Unsets the "reporting" element
     */
    public void unsetReporting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTING$16, 0);
        }
    }
    
    /**
     * Gets the "dependencyManagement" element
     */
    public org.apache.maven.pom.x400.DependencyManagement getDependencyManagement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.DependencyManagement target = null;
            target = (org.apache.maven.pom.x400.DependencyManagement)get_store().find_element_user(DEPENDENCYMANAGEMENT$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dependencyManagement" element
     */
    public boolean isSetDependencyManagement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPENDENCYMANAGEMENT$18) != 0;
        }
    }
    
    /**
     * Sets the "dependencyManagement" element
     */
    public void setDependencyManagement(org.apache.maven.pom.x400.DependencyManagement dependencyManagement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.DependencyManagement target = null;
            target = (org.apache.maven.pom.x400.DependencyManagement)get_store().find_element_user(DEPENDENCYMANAGEMENT$18, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.DependencyManagement)get_store().add_element_user(DEPENDENCYMANAGEMENT$18);
            }
            target.set(dependencyManagement);
        }
    }
    
    /**
     * Appends and returns a new empty "dependencyManagement" element
     */
    public org.apache.maven.pom.x400.DependencyManagement addNewDependencyManagement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.DependencyManagement target = null;
            target = (org.apache.maven.pom.x400.DependencyManagement)get_store().add_element_user(DEPENDENCYMANAGEMENT$18);
            return target;
        }
    }
    
    /**
     * Unsets the "dependencyManagement" element
     */
    public void unsetDependencyManagement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPENDENCYMANAGEMENT$18, 0);
        }
    }
    
    /**
     * Gets the "distributionManagement" element
     */
    public org.apache.maven.pom.x400.DistributionManagement getDistributionManagement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.DistributionManagement target = null;
            target = (org.apache.maven.pom.x400.DistributionManagement)get_store().find_element_user(DISTRIBUTIONMANAGEMENT$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "distributionManagement" element
     */
    public boolean isSetDistributionManagement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTRIBUTIONMANAGEMENT$20) != 0;
        }
    }
    
    /**
     * Sets the "distributionManagement" element
     */
    public void setDistributionManagement(org.apache.maven.pom.x400.DistributionManagement distributionManagement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.DistributionManagement target = null;
            target = (org.apache.maven.pom.x400.DistributionManagement)get_store().find_element_user(DISTRIBUTIONMANAGEMENT$20, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.DistributionManagement)get_store().add_element_user(DISTRIBUTIONMANAGEMENT$20);
            }
            target.set(distributionManagement);
        }
    }
    
    /**
     * Appends and returns a new empty "distributionManagement" element
     */
    public org.apache.maven.pom.x400.DistributionManagement addNewDistributionManagement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.DistributionManagement target = null;
            target = (org.apache.maven.pom.x400.DistributionManagement)get_store().add_element_user(DISTRIBUTIONMANAGEMENT$20);
            return target;
        }
    }
    
    /**
     * Unsets the "distributionManagement" element
     */
    public void unsetDistributionManagement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTRIBUTIONMANAGEMENT$20, 0);
        }
    }
    
    /**
     * Gets the "properties" element
     */
    public org.apache.maven.pom.x400.Profile.Properties getProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Profile.Properties target = null;
            target = (org.apache.maven.pom.x400.Profile.Properties)get_store().find_element_user(PROPERTIES$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "properties" element
     */
    public boolean isSetProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTIES$22) != 0;
        }
    }
    
    /**
     * Sets the "properties" element
     */
    public void setProperties(org.apache.maven.pom.x400.Profile.Properties properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Profile.Properties target = null;
            target = (org.apache.maven.pom.x400.Profile.Properties)get_store().find_element_user(PROPERTIES$22, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Profile.Properties)get_store().add_element_user(PROPERTIES$22);
            }
            target.set(properties);
        }
    }
    
    /**
     * Appends and returns a new empty "properties" element
     */
    public org.apache.maven.pom.x400.Profile.Properties addNewProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Profile.Properties target = null;
            target = (org.apache.maven.pom.x400.Profile.Properties)get_store().add_element_user(PROPERTIES$22);
            return target;
        }
    }
    
    /**
     * Unsets the "properties" element
     */
    public void unsetProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTIES$22, 0);
        }
    }
    /**
     * An XML modules(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class ModulesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Profile.Modules
    {
        private static final long serialVersionUID = 1L;
        
        public ModulesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MODULE$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "module");
        
        
        /**
         * Gets array of all "module" elements
         */
        public java.lang.String[] getModuleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MODULE$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "module" element
         */
        public java.lang.String getModuleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODULE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "module" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetModuleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MODULE$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "module" element
         */
        public org.apache.xmlbeans.XmlString xgetModuleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MODULE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "module" element
         */
        public int sizeOfModuleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MODULE$0);
            }
        }
        
        /**
         * Sets array of all "module" element
         */
        public void setModuleArray(java.lang.String[] moduleArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(moduleArray, MODULE$0);
            }
        }
        
        /**
         * Sets ith "module" element
         */
        public void setModuleArray(int i, java.lang.String module)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODULE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(module);
            }
        }
        
        /**
         * Sets (as xml) array of all "module" element
         */
        public void xsetModuleArray(org.apache.xmlbeans.XmlString[]moduleArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(moduleArray, MODULE$0);
            }
        }
        
        /**
         * Sets (as xml) ith "module" element
         */
        public void xsetModuleArray(int i, org.apache.xmlbeans.XmlString module)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MODULE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(module);
            }
        }
        
        /**
         * Inserts the value as the ith "module" element
         */
        public void insertModule(int i, java.lang.String module)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(MODULE$0, i);
                target.setStringValue(module);
            }
        }
        
        /**
         * Appends the value as the last "module" element
         */
        public void addModule(java.lang.String module)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODULE$0);
                target.setStringValue(module);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "module" element
         */
        public org.apache.xmlbeans.XmlString insertNewModule(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(MODULE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "module" element
         */
        public org.apache.xmlbeans.XmlString addNewModule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MODULE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "module" element
         */
        public void removeModule(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MODULE$0, i);
            }
        }
    }
    /**
     * An XML repositories(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class RepositoriesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Profile.Repositories
    {
        private static final long serialVersionUID = 1L;
        
        public RepositoriesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REPOSITORY$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "repository");
        
        
        /**
         * Gets array of all "repository" elements
         */
        public org.apache.maven.pom.x400.Repository[] getRepositoryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REPOSITORY$0, targetList);
                org.apache.maven.pom.x400.Repository[] result = new org.apache.maven.pom.x400.Repository[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "repository" element
         */
        public org.apache.maven.pom.x400.Repository getRepositoryArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Repository target = null;
                target = (org.apache.maven.pom.x400.Repository)get_store().find_element_user(REPOSITORY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "repository" element
         */
        public int sizeOfRepositoryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPOSITORY$0);
            }
        }
        
        /**
         * Sets array of all "repository" element
         */
        public void setRepositoryArray(org.apache.maven.pom.x400.Repository[] repositoryArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(repositoryArray, REPOSITORY$0);
            }
        }
        
        /**
         * Sets ith "repository" element
         */
        public void setRepositoryArray(int i, org.apache.maven.pom.x400.Repository repository)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Repository target = null;
                target = (org.apache.maven.pom.x400.Repository)get_store().find_element_user(REPOSITORY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(repository);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "repository" element
         */
        public org.apache.maven.pom.x400.Repository insertNewRepository(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Repository target = null;
                target = (org.apache.maven.pom.x400.Repository)get_store().insert_element_user(REPOSITORY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "repository" element
         */
        public org.apache.maven.pom.x400.Repository addNewRepository()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Repository target = null;
                target = (org.apache.maven.pom.x400.Repository)get_store().add_element_user(REPOSITORY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "repository" element
         */
        public void removeRepository(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPOSITORY$0, i);
            }
        }
    }
    /**
     * An XML pluginRepositories(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class PluginRepositoriesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Profile.PluginRepositories
    {
        private static final long serialVersionUID = 1L;
        
        public PluginRepositoriesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PLUGINREPOSITORY$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "pluginRepository");
        
        
        /**
         * Gets array of all "pluginRepository" elements
         */
        public org.apache.maven.pom.x400.Repository[] getPluginRepositoryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PLUGINREPOSITORY$0, targetList);
                org.apache.maven.pom.x400.Repository[] result = new org.apache.maven.pom.x400.Repository[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "pluginRepository" element
         */
        public org.apache.maven.pom.x400.Repository getPluginRepositoryArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Repository target = null;
                target = (org.apache.maven.pom.x400.Repository)get_store().find_element_user(PLUGINREPOSITORY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "pluginRepository" element
         */
        public int sizeOfPluginRepositoryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PLUGINREPOSITORY$0);
            }
        }
        
        /**
         * Sets array of all "pluginRepository" element
         */
        public void setPluginRepositoryArray(org.apache.maven.pom.x400.Repository[] pluginRepositoryArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pluginRepositoryArray, PLUGINREPOSITORY$0);
            }
        }
        
        /**
         * Sets ith "pluginRepository" element
         */
        public void setPluginRepositoryArray(int i, org.apache.maven.pom.x400.Repository pluginRepository)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Repository target = null;
                target = (org.apache.maven.pom.x400.Repository)get_store().find_element_user(PLUGINREPOSITORY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(pluginRepository);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "pluginRepository" element
         */
        public org.apache.maven.pom.x400.Repository insertNewPluginRepository(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Repository target = null;
                target = (org.apache.maven.pom.x400.Repository)get_store().insert_element_user(PLUGINREPOSITORY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "pluginRepository" element
         */
        public org.apache.maven.pom.x400.Repository addNewPluginRepository()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Repository target = null;
                target = (org.apache.maven.pom.x400.Repository)get_store().add_element_user(PLUGINREPOSITORY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "pluginRepository" element
         */
        public void removePluginRepository(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PLUGINREPOSITORY$0, i);
            }
        }
    }
    /**
     * An XML dependencies(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class DependenciesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Profile.Dependencies
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
     * An XML reports(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class ReportsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Profile.Reports
    {
        private static final long serialVersionUID = 1L;
        
        public ReportsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
    /**
     * An XML properties(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class PropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Profile.Properties
    {
        private static final long serialVersionUID = 1L;
        
        public PropertiesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
