/*
 * XML Type:  Model
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.Model
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * An XML Model(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public class ModelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Model
{
    private static final long serialVersionUID = 1L;
    
    public ModelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARENT$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "parent");
    private static final javax.xml.namespace.QName MODELVERSION$2 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "modelVersion");
    private static final javax.xml.namespace.QName GROUPID$4 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "groupId");
    private static final javax.xml.namespace.QName ARTIFACTID$6 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "artifactId");
    private static final javax.xml.namespace.QName PACKAGING$8 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "packaging");
    private static final javax.xml.namespace.QName NAME$10 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "name");
    private static final javax.xml.namespace.QName VERSION$12 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "version");
    private static final javax.xml.namespace.QName DESCRIPTION$14 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "description");
    private static final javax.xml.namespace.QName URL$16 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "url");
    private static final javax.xml.namespace.QName PREREQUISITES$18 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "prerequisites");
    private static final javax.xml.namespace.QName ISSUEMANAGEMENT$20 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "issueManagement");
    private static final javax.xml.namespace.QName CIMANAGEMENT$22 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "ciManagement");
    private static final javax.xml.namespace.QName INCEPTIONYEAR$24 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "inceptionYear");
    private static final javax.xml.namespace.QName MAILINGLISTS$26 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "mailingLists");
    private static final javax.xml.namespace.QName DEVELOPERS$28 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "developers");
    private static final javax.xml.namespace.QName CONTRIBUTORS$30 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "contributors");
    private static final javax.xml.namespace.QName LICENSES$32 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "licenses");
    private static final javax.xml.namespace.QName SCM$34 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "scm");
    private static final javax.xml.namespace.QName ORGANIZATION$36 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "organization");
    private static final javax.xml.namespace.QName BUILD$38 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "build");
    private static final javax.xml.namespace.QName PROFILES$40 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "profiles");
    private static final javax.xml.namespace.QName MODULES$42 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "modules");
    private static final javax.xml.namespace.QName REPOSITORIES$44 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "repositories");
    private static final javax.xml.namespace.QName PLUGINREPOSITORIES$46 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "pluginRepositories");
    private static final javax.xml.namespace.QName DEPENDENCIES$48 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "dependencies");
    private static final javax.xml.namespace.QName REPORTS$50 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "reports");
    private static final javax.xml.namespace.QName REPORTING$52 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "reporting");
    private static final javax.xml.namespace.QName DEPENDENCYMANAGEMENT$54 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "dependencyManagement");
    private static final javax.xml.namespace.QName DISTRIBUTIONMANAGEMENT$56 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "distributionManagement");
    private static final javax.xml.namespace.QName PROPERTIES$58 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "properties");
    
    
    /**
     * Gets the "parent" element
     */
    public org.apache.maven.pom.x400.Parent getParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Parent target = null;
            target = (org.apache.maven.pom.x400.Parent)get_store().find_element_user(PARENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "parent" element
     */
    public boolean isSetParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENT$0) != 0;
        }
    }
    
    /**
     * Sets the "parent" element
     */
    public void setParent(org.apache.maven.pom.x400.Parent parent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Parent target = null;
            target = (org.apache.maven.pom.x400.Parent)get_store().find_element_user(PARENT$0, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Parent)get_store().add_element_user(PARENT$0);
            }
            target.set(parent);
        }
    }
    
    /**
     * Appends and returns a new empty "parent" element
     */
    public org.apache.maven.pom.x400.Parent addNewParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Parent target = null;
            target = (org.apache.maven.pom.x400.Parent)get_store().add_element_user(PARENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "parent" element
     */
    public void unsetParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENT$0, 0);
        }
    }
    
    /**
     * Gets the "modelVersion" element
     */
    public java.lang.String getModelVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODELVERSION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "modelVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetModelVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MODELVERSION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "modelVersion" element
     */
    public boolean isSetModelVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODELVERSION$2) != 0;
        }
    }
    
    /**
     * Sets the "modelVersion" element
     */
    public void setModelVersion(java.lang.String modelVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODELVERSION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODELVERSION$2);
            }
            target.setStringValue(modelVersion);
        }
    }
    
    /**
     * Sets (as xml) the "modelVersion" element
     */
    public void xsetModelVersion(org.apache.xmlbeans.XmlString modelVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MODELVERSION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MODELVERSION$2);
            }
            target.set(modelVersion);
        }
    }
    
    /**
     * Unsets the "modelVersion" element
     */
    public void unsetModelVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODELVERSION$2, 0);
        }
    }
    
    /**
     * Gets the "groupId" element
     */
    public java.lang.String getGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPID$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPID$4, 0);
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
            return get_store().count_elements(GROUPID$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUPID$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GROUPID$4);
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
            get_store().remove_element(GROUPID$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARTIFACTID$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARTIFACTID$6, 0);
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
            return get_store().count_elements(ARTIFACTID$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARTIFACTID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARTIFACTID$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARTIFACTID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARTIFACTID$6);
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
            get_store().remove_element(ARTIFACTID$6, 0);
        }
    }
    
    /**
     * Gets the "packaging" element
     */
    public java.lang.String getPackaging()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PACKAGING$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "packaging" element
     */
    public org.apache.xmlbeans.XmlString xgetPackaging()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PACKAGING$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "packaging" element
     */
    public boolean isSetPackaging()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PACKAGING$8) != 0;
        }
    }
    
    /**
     * Sets the "packaging" element
     */
    public void setPackaging(java.lang.String packaging)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PACKAGING$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PACKAGING$8);
            }
            target.setStringValue(packaging);
        }
    }
    
    /**
     * Sets (as xml) the "packaging" element
     */
    public void xsetPackaging(org.apache.xmlbeans.XmlString packaging)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PACKAGING$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PACKAGING$8);
            }
            target.set(packaging);
        }
    }
    
    /**
     * Unsets the "packaging" element
     */
    public void unsetPackaging()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PACKAGING$8, 0);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$10) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$10);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$10);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$12, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$12, 0);
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
            return get_store().count_elements(VERSION$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$12);
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
            get_store().remove_element(VERSION$12, 0);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$14) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$14);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$14);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$14, 0);
        }
    }
    
    /**
     * Gets the "url" element
     */
    public java.lang.String getUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "url" element
     */
    public org.apache.xmlbeans.XmlString xgetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "url" element
     */
    public boolean isSetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URL$16) != 0;
        }
    }
    
    /**
     * Sets the "url" element
     */
    public void setUrl(java.lang.String url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URL$16);
            }
            target.setStringValue(url);
        }
    }
    
    /**
     * Sets (as xml) the "url" element
     */
    public void xsetUrl(org.apache.xmlbeans.XmlString url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URL$16);
            }
            target.set(url);
        }
    }
    
    /**
     * Unsets the "url" element
     */
    public void unsetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URL$16, 0);
        }
    }
    
    /**
     * Gets the "prerequisites" element
     */
    public org.apache.maven.pom.x400.Prerequisites getPrerequisites()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Prerequisites target = null;
            target = (org.apache.maven.pom.x400.Prerequisites)get_store().find_element_user(PREREQUISITES$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "prerequisites" element
     */
    public boolean isSetPrerequisites()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREREQUISITES$18) != 0;
        }
    }
    
    /**
     * Sets the "prerequisites" element
     */
    public void setPrerequisites(org.apache.maven.pom.x400.Prerequisites prerequisites)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Prerequisites target = null;
            target = (org.apache.maven.pom.x400.Prerequisites)get_store().find_element_user(PREREQUISITES$18, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Prerequisites)get_store().add_element_user(PREREQUISITES$18);
            }
            target.set(prerequisites);
        }
    }
    
    /**
     * Appends and returns a new empty "prerequisites" element
     */
    public org.apache.maven.pom.x400.Prerequisites addNewPrerequisites()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Prerequisites target = null;
            target = (org.apache.maven.pom.x400.Prerequisites)get_store().add_element_user(PREREQUISITES$18);
            return target;
        }
    }
    
    /**
     * Unsets the "prerequisites" element
     */
    public void unsetPrerequisites()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREREQUISITES$18, 0);
        }
    }
    
    /**
     * Gets the "issueManagement" element
     */
    public org.apache.maven.pom.x400.IssueManagement getIssueManagement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.IssueManagement target = null;
            target = (org.apache.maven.pom.x400.IssueManagement)get_store().find_element_user(ISSUEMANAGEMENT$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "issueManagement" element
     */
    public boolean isSetIssueManagement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSUEMANAGEMENT$20) != 0;
        }
    }
    
    /**
     * Sets the "issueManagement" element
     */
    public void setIssueManagement(org.apache.maven.pom.x400.IssueManagement issueManagement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.IssueManagement target = null;
            target = (org.apache.maven.pom.x400.IssueManagement)get_store().find_element_user(ISSUEMANAGEMENT$20, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.IssueManagement)get_store().add_element_user(ISSUEMANAGEMENT$20);
            }
            target.set(issueManagement);
        }
    }
    
    /**
     * Appends and returns a new empty "issueManagement" element
     */
    public org.apache.maven.pom.x400.IssueManagement addNewIssueManagement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.IssueManagement target = null;
            target = (org.apache.maven.pom.x400.IssueManagement)get_store().add_element_user(ISSUEMANAGEMENT$20);
            return target;
        }
    }
    
    /**
     * Unsets the "issueManagement" element
     */
    public void unsetIssueManagement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSUEMANAGEMENT$20, 0);
        }
    }
    
    /**
     * Gets the "ciManagement" element
     */
    public org.apache.maven.pom.x400.CiManagement getCiManagement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.CiManagement target = null;
            target = (org.apache.maven.pom.x400.CiManagement)get_store().find_element_user(CIMANAGEMENT$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ciManagement" element
     */
    public boolean isSetCiManagement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CIMANAGEMENT$22) != 0;
        }
    }
    
    /**
     * Sets the "ciManagement" element
     */
    public void setCiManagement(org.apache.maven.pom.x400.CiManagement ciManagement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.CiManagement target = null;
            target = (org.apache.maven.pom.x400.CiManagement)get_store().find_element_user(CIMANAGEMENT$22, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.CiManagement)get_store().add_element_user(CIMANAGEMENT$22);
            }
            target.set(ciManagement);
        }
    }
    
    /**
     * Appends and returns a new empty "ciManagement" element
     */
    public org.apache.maven.pom.x400.CiManagement addNewCiManagement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.CiManagement target = null;
            target = (org.apache.maven.pom.x400.CiManagement)get_store().add_element_user(CIMANAGEMENT$22);
            return target;
        }
    }
    
    /**
     * Unsets the "ciManagement" element
     */
    public void unsetCiManagement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CIMANAGEMENT$22, 0);
        }
    }
    
    /**
     * Gets the "inceptionYear" element
     */
    public java.lang.String getInceptionYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCEPTIONYEAR$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "inceptionYear" element
     */
    public org.apache.xmlbeans.XmlString xgetInceptionYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCEPTIONYEAR$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "inceptionYear" element
     */
    public boolean isSetInceptionYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCEPTIONYEAR$24) != 0;
        }
    }
    
    /**
     * Sets the "inceptionYear" element
     */
    public void setInceptionYear(java.lang.String inceptionYear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCEPTIONYEAR$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCEPTIONYEAR$24);
            }
            target.setStringValue(inceptionYear);
        }
    }
    
    /**
     * Sets (as xml) the "inceptionYear" element
     */
    public void xsetInceptionYear(org.apache.xmlbeans.XmlString inceptionYear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCEPTIONYEAR$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCEPTIONYEAR$24);
            }
            target.set(inceptionYear);
        }
    }
    
    /**
     * Unsets the "inceptionYear" element
     */
    public void unsetInceptionYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCEPTIONYEAR$24, 0);
        }
    }
    
    /**
     * Gets the "mailingLists" element
     */
    public org.apache.maven.pom.x400.Model.MailingLists getMailingLists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.MailingLists target = null;
            target = (org.apache.maven.pom.x400.Model.MailingLists)get_store().find_element_user(MAILINGLISTS$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mailingLists" element
     */
    public boolean isSetMailingLists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAILINGLISTS$26) != 0;
        }
    }
    
    /**
     * Sets the "mailingLists" element
     */
    public void setMailingLists(org.apache.maven.pom.x400.Model.MailingLists mailingLists)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.MailingLists target = null;
            target = (org.apache.maven.pom.x400.Model.MailingLists)get_store().find_element_user(MAILINGLISTS$26, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Model.MailingLists)get_store().add_element_user(MAILINGLISTS$26);
            }
            target.set(mailingLists);
        }
    }
    
    /**
     * Appends and returns a new empty "mailingLists" element
     */
    public org.apache.maven.pom.x400.Model.MailingLists addNewMailingLists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.MailingLists target = null;
            target = (org.apache.maven.pom.x400.Model.MailingLists)get_store().add_element_user(MAILINGLISTS$26);
            return target;
        }
    }
    
    /**
     * Unsets the "mailingLists" element
     */
    public void unsetMailingLists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAILINGLISTS$26, 0);
        }
    }
    
    /**
     * Gets the "developers" element
     */
    public org.apache.maven.pom.x400.Model.Developers getDevelopers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Developers target = null;
            target = (org.apache.maven.pom.x400.Model.Developers)get_store().find_element_user(DEVELOPERS$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "developers" element
     */
    public boolean isSetDevelopers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEVELOPERS$28) != 0;
        }
    }
    
    /**
     * Sets the "developers" element
     */
    public void setDevelopers(org.apache.maven.pom.x400.Model.Developers developers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Developers target = null;
            target = (org.apache.maven.pom.x400.Model.Developers)get_store().find_element_user(DEVELOPERS$28, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Model.Developers)get_store().add_element_user(DEVELOPERS$28);
            }
            target.set(developers);
        }
    }
    
    /**
     * Appends and returns a new empty "developers" element
     */
    public org.apache.maven.pom.x400.Model.Developers addNewDevelopers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Developers target = null;
            target = (org.apache.maven.pom.x400.Model.Developers)get_store().add_element_user(DEVELOPERS$28);
            return target;
        }
    }
    
    /**
     * Unsets the "developers" element
     */
    public void unsetDevelopers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEVELOPERS$28, 0);
        }
    }
    
    /**
     * Gets the "contributors" element
     */
    public org.apache.maven.pom.x400.Model.Contributors getContributors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Contributors target = null;
            target = (org.apache.maven.pom.x400.Model.Contributors)get_store().find_element_user(CONTRIBUTORS$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "contributors" element
     */
    public boolean isSetContributors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTRIBUTORS$30) != 0;
        }
    }
    
    /**
     * Sets the "contributors" element
     */
    public void setContributors(org.apache.maven.pom.x400.Model.Contributors contributors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Contributors target = null;
            target = (org.apache.maven.pom.x400.Model.Contributors)get_store().find_element_user(CONTRIBUTORS$30, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Model.Contributors)get_store().add_element_user(CONTRIBUTORS$30);
            }
            target.set(contributors);
        }
    }
    
    /**
     * Appends and returns a new empty "contributors" element
     */
    public org.apache.maven.pom.x400.Model.Contributors addNewContributors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Contributors target = null;
            target = (org.apache.maven.pom.x400.Model.Contributors)get_store().add_element_user(CONTRIBUTORS$30);
            return target;
        }
    }
    
    /**
     * Unsets the "contributors" element
     */
    public void unsetContributors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTRIBUTORS$30, 0);
        }
    }
    
    /**
     * Gets the "licenses" element
     */
    public org.apache.maven.pom.x400.Model.Licenses getLicenses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Licenses target = null;
            target = (org.apache.maven.pom.x400.Model.Licenses)get_store().find_element_user(LICENSES$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "licenses" element
     */
    public boolean isSetLicenses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LICENSES$32) != 0;
        }
    }
    
    /**
     * Sets the "licenses" element
     */
    public void setLicenses(org.apache.maven.pom.x400.Model.Licenses licenses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Licenses target = null;
            target = (org.apache.maven.pom.x400.Model.Licenses)get_store().find_element_user(LICENSES$32, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Model.Licenses)get_store().add_element_user(LICENSES$32);
            }
            target.set(licenses);
        }
    }
    
    /**
     * Appends and returns a new empty "licenses" element
     */
    public org.apache.maven.pom.x400.Model.Licenses addNewLicenses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Licenses target = null;
            target = (org.apache.maven.pom.x400.Model.Licenses)get_store().add_element_user(LICENSES$32);
            return target;
        }
    }
    
    /**
     * Unsets the "licenses" element
     */
    public void unsetLicenses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LICENSES$32, 0);
        }
    }
    
    /**
     * Gets the "scm" element
     */
    public org.apache.maven.pom.x400.Scm getScm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Scm target = null;
            target = (org.apache.maven.pom.x400.Scm)get_store().find_element_user(SCM$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "scm" element
     */
    public boolean isSetScm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCM$34) != 0;
        }
    }
    
    /**
     * Sets the "scm" element
     */
    public void setScm(org.apache.maven.pom.x400.Scm scm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Scm target = null;
            target = (org.apache.maven.pom.x400.Scm)get_store().find_element_user(SCM$34, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Scm)get_store().add_element_user(SCM$34);
            }
            target.set(scm);
        }
    }
    
    /**
     * Appends and returns a new empty "scm" element
     */
    public org.apache.maven.pom.x400.Scm addNewScm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Scm target = null;
            target = (org.apache.maven.pom.x400.Scm)get_store().add_element_user(SCM$34);
            return target;
        }
    }
    
    /**
     * Unsets the "scm" element
     */
    public void unsetScm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCM$34, 0);
        }
    }
    
    /**
     * Gets the "organization" element
     */
    public org.apache.maven.pom.x400.Organization getOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Organization target = null;
            target = (org.apache.maven.pom.x400.Organization)get_store().find_element_user(ORGANIZATION$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "organization" element
     */
    public boolean isSetOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATION$36) != 0;
        }
    }
    
    /**
     * Sets the "organization" element
     */
    public void setOrganization(org.apache.maven.pom.x400.Organization organization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Organization target = null;
            target = (org.apache.maven.pom.x400.Organization)get_store().find_element_user(ORGANIZATION$36, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Organization)get_store().add_element_user(ORGANIZATION$36);
            }
            target.set(organization);
        }
    }
    
    /**
     * Appends and returns a new empty "organization" element
     */
    public org.apache.maven.pom.x400.Organization addNewOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Organization target = null;
            target = (org.apache.maven.pom.x400.Organization)get_store().add_element_user(ORGANIZATION$36);
            return target;
        }
    }
    
    /**
     * Unsets the "organization" element
     */
    public void unsetOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATION$36, 0);
        }
    }
    
    /**
     * Gets the "build" element
     */
    public org.apache.maven.pom.x400.Build getBuild()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Build target = null;
            target = (org.apache.maven.pom.x400.Build)get_store().find_element_user(BUILD$38, 0);
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
            return get_store().count_elements(BUILD$38) != 0;
        }
    }
    
    /**
     * Sets the "build" element
     */
    public void setBuild(org.apache.maven.pom.x400.Build build)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Build target = null;
            target = (org.apache.maven.pom.x400.Build)get_store().find_element_user(BUILD$38, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Build)get_store().add_element_user(BUILD$38);
            }
            target.set(build);
        }
    }
    
    /**
     * Appends and returns a new empty "build" element
     */
    public org.apache.maven.pom.x400.Build addNewBuild()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Build target = null;
            target = (org.apache.maven.pom.x400.Build)get_store().add_element_user(BUILD$38);
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
            get_store().remove_element(BUILD$38, 0);
        }
    }
    
    /**
     * Gets the "profiles" element
     */
    public org.apache.maven.pom.x400.Model.Profiles getProfiles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Profiles target = null;
            target = (org.apache.maven.pom.x400.Model.Profiles)get_store().find_element_user(PROFILES$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "profiles" element
     */
    public boolean isSetProfiles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROFILES$40) != 0;
        }
    }
    
    /**
     * Sets the "profiles" element
     */
    public void setProfiles(org.apache.maven.pom.x400.Model.Profiles profiles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Profiles target = null;
            target = (org.apache.maven.pom.x400.Model.Profiles)get_store().find_element_user(PROFILES$40, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Model.Profiles)get_store().add_element_user(PROFILES$40);
            }
            target.set(profiles);
        }
    }
    
    /**
     * Appends and returns a new empty "profiles" element
     */
    public org.apache.maven.pom.x400.Model.Profiles addNewProfiles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Profiles target = null;
            target = (org.apache.maven.pom.x400.Model.Profiles)get_store().add_element_user(PROFILES$40);
            return target;
        }
    }
    
    /**
     * Unsets the "profiles" element
     */
    public void unsetProfiles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROFILES$40, 0);
        }
    }
    
    /**
     * Gets the "modules" element
     */
    public org.apache.maven.pom.x400.Model.Modules getModules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Modules target = null;
            target = (org.apache.maven.pom.x400.Model.Modules)get_store().find_element_user(MODULES$42, 0);
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
            return get_store().count_elements(MODULES$42) != 0;
        }
    }
    
    /**
     * Sets the "modules" element
     */
    public void setModules(org.apache.maven.pom.x400.Model.Modules modules)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Modules target = null;
            target = (org.apache.maven.pom.x400.Model.Modules)get_store().find_element_user(MODULES$42, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Model.Modules)get_store().add_element_user(MODULES$42);
            }
            target.set(modules);
        }
    }
    
    /**
     * Appends and returns a new empty "modules" element
     */
    public org.apache.maven.pom.x400.Model.Modules addNewModules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Modules target = null;
            target = (org.apache.maven.pom.x400.Model.Modules)get_store().add_element_user(MODULES$42);
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
            get_store().remove_element(MODULES$42, 0);
        }
    }
    
    /**
     * Gets the "repositories" element
     */
    public org.apache.maven.pom.x400.Model.Repositories getRepositories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Repositories target = null;
            target = (org.apache.maven.pom.x400.Model.Repositories)get_store().find_element_user(REPOSITORIES$44, 0);
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
            return get_store().count_elements(REPOSITORIES$44) != 0;
        }
    }
    
    /**
     * Sets the "repositories" element
     */
    public void setRepositories(org.apache.maven.pom.x400.Model.Repositories repositories)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Repositories target = null;
            target = (org.apache.maven.pom.x400.Model.Repositories)get_store().find_element_user(REPOSITORIES$44, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Model.Repositories)get_store().add_element_user(REPOSITORIES$44);
            }
            target.set(repositories);
        }
    }
    
    /**
     * Appends and returns a new empty "repositories" element
     */
    public org.apache.maven.pom.x400.Model.Repositories addNewRepositories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Repositories target = null;
            target = (org.apache.maven.pom.x400.Model.Repositories)get_store().add_element_user(REPOSITORIES$44);
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
            get_store().remove_element(REPOSITORIES$44, 0);
        }
    }
    
    /**
     * Gets the "pluginRepositories" element
     */
    public org.apache.maven.pom.x400.Model.PluginRepositories getPluginRepositories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.PluginRepositories target = null;
            target = (org.apache.maven.pom.x400.Model.PluginRepositories)get_store().find_element_user(PLUGINREPOSITORIES$46, 0);
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
            return get_store().count_elements(PLUGINREPOSITORIES$46) != 0;
        }
    }
    
    /**
     * Sets the "pluginRepositories" element
     */
    public void setPluginRepositories(org.apache.maven.pom.x400.Model.PluginRepositories pluginRepositories)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.PluginRepositories target = null;
            target = (org.apache.maven.pom.x400.Model.PluginRepositories)get_store().find_element_user(PLUGINREPOSITORIES$46, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Model.PluginRepositories)get_store().add_element_user(PLUGINREPOSITORIES$46);
            }
            target.set(pluginRepositories);
        }
    }
    
    /**
     * Appends and returns a new empty "pluginRepositories" element
     */
    public org.apache.maven.pom.x400.Model.PluginRepositories addNewPluginRepositories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.PluginRepositories target = null;
            target = (org.apache.maven.pom.x400.Model.PluginRepositories)get_store().add_element_user(PLUGINREPOSITORIES$46);
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
            get_store().remove_element(PLUGINREPOSITORIES$46, 0);
        }
    }
    
    /**
     * Gets the "dependencies" element
     */
    public org.apache.maven.pom.x400.Model.Dependencies getDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Dependencies target = null;
            target = (org.apache.maven.pom.x400.Model.Dependencies)get_store().find_element_user(DEPENDENCIES$48, 0);
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
            return get_store().count_elements(DEPENDENCIES$48) != 0;
        }
    }
    
    /**
     * Sets the "dependencies" element
     */
    public void setDependencies(org.apache.maven.pom.x400.Model.Dependencies dependencies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Dependencies target = null;
            target = (org.apache.maven.pom.x400.Model.Dependencies)get_store().find_element_user(DEPENDENCIES$48, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Model.Dependencies)get_store().add_element_user(DEPENDENCIES$48);
            }
            target.set(dependencies);
        }
    }
    
    /**
     * Appends and returns a new empty "dependencies" element
     */
    public org.apache.maven.pom.x400.Model.Dependencies addNewDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Dependencies target = null;
            target = (org.apache.maven.pom.x400.Model.Dependencies)get_store().add_element_user(DEPENDENCIES$48);
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
            get_store().remove_element(DEPENDENCIES$48, 0);
        }
    }
    
    /**
     * Gets the "reports" element
     */
    public org.apache.maven.pom.x400.Model.Reports getReports()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Reports target = null;
            target = (org.apache.maven.pom.x400.Model.Reports)get_store().find_element_user(REPORTS$50, 0);
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
            return get_store().count_elements(REPORTS$50) != 0;
        }
    }
    
    /**
     * Sets the "reports" element
     */
    public void setReports(org.apache.maven.pom.x400.Model.Reports reports)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Reports target = null;
            target = (org.apache.maven.pom.x400.Model.Reports)get_store().find_element_user(REPORTS$50, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Model.Reports)get_store().add_element_user(REPORTS$50);
            }
            target.set(reports);
        }
    }
    
    /**
     * Appends and returns a new empty "reports" element
     */
    public org.apache.maven.pom.x400.Model.Reports addNewReports()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Reports target = null;
            target = (org.apache.maven.pom.x400.Model.Reports)get_store().add_element_user(REPORTS$50);
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
            get_store().remove_element(REPORTS$50, 0);
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
            target = (org.apache.maven.pom.x400.Reporting)get_store().find_element_user(REPORTING$52, 0);
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
            return get_store().count_elements(REPORTING$52) != 0;
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
            target = (org.apache.maven.pom.x400.Reporting)get_store().find_element_user(REPORTING$52, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Reporting)get_store().add_element_user(REPORTING$52);
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
            target = (org.apache.maven.pom.x400.Reporting)get_store().add_element_user(REPORTING$52);
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
            get_store().remove_element(REPORTING$52, 0);
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
            target = (org.apache.maven.pom.x400.DependencyManagement)get_store().find_element_user(DEPENDENCYMANAGEMENT$54, 0);
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
            return get_store().count_elements(DEPENDENCYMANAGEMENT$54) != 0;
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
            target = (org.apache.maven.pom.x400.DependencyManagement)get_store().find_element_user(DEPENDENCYMANAGEMENT$54, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.DependencyManagement)get_store().add_element_user(DEPENDENCYMANAGEMENT$54);
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
            target = (org.apache.maven.pom.x400.DependencyManagement)get_store().add_element_user(DEPENDENCYMANAGEMENT$54);
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
            get_store().remove_element(DEPENDENCYMANAGEMENT$54, 0);
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
            target = (org.apache.maven.pom.x400.DistributionManagement)get_store().find_element_user(DISTRIBUTIONMANAGEMENT$56, 0);
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
            return get_store().count_elements(DISTRIBUTIONMANAGEMENT$56) != 0;
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
            target = (org.apache.maven.pom.x400.DistributionManagement)get_store().find_element_user(DISTRIBUTIONMANAGEMENT$56, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.DistributionManagement)get_store().add_element_user(DISTRIBUTIONMANAGEMENT$56);
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
            target = (org.apache.maven.pom.x400.DistributionManagement)get_store().add_element_user(DISTRIBUTIONMANAGEMENT$56);
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
            get_store().remove_element(DISTRIBUTIONMANAGEMENT$56, 0);
        }
    }
    
    /**
     * Gets the "properties" element
     */
    public org.apache.maven.pom.x400.Model.Properties getProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Properties target = null;
            target = (org.apache.maven.pom.x400.Model.Properties)get_store().find_element_user(PROPERTIES$58, 0);
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
            return get_store().count_elements(PROPERTIES$58) != 0;
        }
    }
    
    /**
     * Sets the "properties" element
     */
    public void setProperties(org.apache.maven.pom.x400.Model.Properties properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Properties target = null;
            target = (org.apache.maven.pom.x400.Model.Properties)get_store().find_element_user(PROPERTIES$58, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Model.Properties)get_store().add_element_user(PROPERTIES$58);
            }
            target.set(properties);
        }
    }
    
    /**
     * Appends and returns a new empty "properties" element
     */
    public org.apache.maven.pom.x400.Model.Properties addNewProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model.Properties target = null;
            target = (org.apache.maven.pom.x400.Model.Properties)get_store().add_element_user(PROPERTIES$58);
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
            get_store().remove_element(PROPERTIES$58, 0);
        }
    }
    /**
     * An XML mailingLists(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class MailingListsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Model.MailingLists
    {
        private static final long serialVersionUID = 1L;
        
        public MailingListsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MAILINGLIST$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "mailingList");
        
        
        /**
         * Gets array of all "mailingList" elements
         */
        public org.apache.maven.pom.x400.MailingList[] getMailingListArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MAILINGLIST$0, targetList);
                org.apache.maven.pom.x400.MailingList[] result = new org.apache.maven.pom.x400.MailingList[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "mailingList" element
         */
        public org.apache.maven.pom.x400.MailingList getMailingListArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.MailingList target = null;
                target = (org.apache.maven.pom.x400.MailingList)get_store().find_element_user(MAILINGLIST$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "mailingList" element
         */
        public int sizeOfMailingListArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAILINGLIST$0);
            }
        }
        
        /**
         * Sets array of all "mailingList" element
         */
        public void setMailingListArray(org.apache.maven.pom.x400.MailingList[] mailingListArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(mailingListArray, MAILINGLIST$0);
            }
        }
        
        /**
         * Sets ith "mailingList" element
         */
        public void setMailingListArray(int i, org.apache.maven.pom.x400.MailingList mailingList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.MailingList target = null;
                target = (org.apache.maven.pom.x400.MailingList)get_store().find_element_user(MAILINGLIST$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(mailingList);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "mailingList" element
         */
        public org.apache.maven.pom.x400.MailingList insertNewMailingList(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.MailingList target = null;
                target = (org.apache.maven.pom.x400.MailingList)get_store().insert_element_user(MAILINGLIST$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "mailingList" element
         */
        public org.apache.maven.pom.x400.MailingList addNewMailingList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.MailingList target = null;
                target = (org.apache.maven.pom.x400.MailingList)get_store().add_element_user(MAILINGLIST$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "mailingList" element
         */
        public void removeMailingList(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAILINGLIST$0, i);
            }
        }
    }
    /**
     * An XML developers(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class DevelopersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Model.Developers
    {
        private static final long serialVersionUID = 1L;
        
        public DevelopersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DEVELOPER$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "developer");
        
        
        /**
         * Gets array of all "developer" elements
         */
        public org.apache.maven.pom.x400.Developer[] getDeveloperArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DEVELOPER$0, targetList);
                org.apache.maven.pom.x400.Developer[] result = new org.apache.maven.pom.x400.Developer[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "developer" element
         */
        public org.apache.maven.pom.x400.Developer getDeveloperArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Developer target = null;
                target = (org.apache.maven.pom.x400.Developer)get_store().find_element_user(DEVELOPER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "developer" element
         */
        public int sizeOfDeveloperArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEVELOPER$0);
            }
        }
        
        /**
         * Sets array of all "developer" element
         */
        public void setDeveloperArray(org.apache.maven.pom.x400.Developer[] developerArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(developerArray, DEVELOPER$0);
            }
        }
        
        /**
         * Sets ith "developer" element
         */
        public void setDeveloperArray(int i, org.apache.maven.pom.x400.Developer developer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Developer target = null;
                target = (org.apache.maven.pom.x400.Developer)get_store().find_element_user(DEVELOPER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(developer);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "developer" element
         */
        public org.apache.maven.pom.x400.Developer insertNewDeveloper(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Developer target = null;
                target = (org.apache.maven.pom.x400.Developer)get_store().insert_element_user(DEVELOPER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "developer" element
         */
        public org.apache.maven.pom.x400.Developer addNewDeveloper()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Developer target = null;
                target = (org.apache.maven.pom.x400.Developer)get_store().add_element_user(DEVELOPER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "developer" element
         */
        public void removeDeveloper(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEVELOPER$0, i);
            }
        }
    }
    /**
     * An XML contributors(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class ContributorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Model.Contributors
    {
        private static final long serialVersionUID = 1L;
        
        public ContributorsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONTRIBUTOR$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "contributor");
        
        
        /**
         * Gets array of all "contributor" elements
         */
        public org.apache.maven.pom.x400.Contributor[] getContributorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONTRIBUTOR$0, targetList);
                org.apache.maven.pom.x400.Contributor[] result = new org.apache.maven.pom.x400.Contributor[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "contributor" element
         */
        public org.apache.maven.pom.x400.Contributor getContributorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Contributor target = null;
                target = (org.apache.maven.pom.x400.Contributor)get_store().find_element_user(CONTRIBUTOR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "contributor" element
         */
        public int sizeOfContributorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTRIBUTOR$0);
            }
        }
        
        /**
         * Sets array of all "contributor" element
         */
        public void setContributorArray(org.apache.maven.pom.x400.Contributor[] contributorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(contributorArray, CONTRIBUTOR$0);
            }
        }
        
        /**
         * Sets ith "contributor" element
         */
        public void setContributorArray(int i, org.apache.maven.pom.x400.Contributor contributor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Contributor target = null;
                target = (org.apache.maven.pom.x400.Contributor)get_store().find_element_user(CONTRIBUTOR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(contributor);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "contributor" element
         */
        public org.apache.maven.pom.x400.Contributor insertNewContributor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Contributor target = null;
                target = (org.apache.maven.pom.x400.Contributor)get_store().insert_element_user(CONTRIBUTOR$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "contributor" element
         */
        public org.apache.maven.pom.x400.Contributor addNewContributor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Contributor target = null;
                target = (org.apache.maven.pom.x400.Contributor)get_store().add_element_user(CONTRIBUTOR$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "contributor" element
         */
        public void removeContributor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTRIBUTOR$0, i);
            }
        }
    }
    /**
     * An XML licenses(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class LicensesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Model.Licenses
    {
        private static final long serialVersionUID = 1L;
        
        public LicensesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LICENSE$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "license");
        
        
        /**
         * Gets array of all "license" elements
         */
        public org.apache.maven.pom.x400.License[] getLicenseArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LICENSE$0, targetList);
                org.apache.maven.pom.x400.License[] result = new org.apache.maven.pom.x400.License[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "license" element
         */
        public org.apache.maven.pom.x400.License getLicenseArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.License target = null;
                target = (org.apache.maven.pom.x400.License)get_store().find_element_user(LICENSE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "license" element
         */
        public int sizeOfLicenseArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LICENSE$0);
            }
        }
        
        /**
         * Sets array of all "license" element
         */
        public void setLicenseArray(org.apache.maven.pom.x400.License[] licenseArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(licenseArray, LICENSE$0);
            }
        }
        
        /**
         * Sets ith "license" element
         */
        public void setLicenseArray(int i, org.apache.maven.pom.x400.License license)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.License target = null;
                target = (org.apache.maven.pom.x400.License)get_store().find_element_user(LICENSE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(license);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "license" element
         */
        public org.apache.maven.pom.x400.License insertNewLicense(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.License target = null;
                target = (org.apache.maven.pom.x400.License)get_store().insert_element_user(LICENSE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "license" element
         */
        public org.apache.maven.pom.x400.License addNewLicense()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.License target = null;
                target = (org.apache.maven.pom.x400.License)get_store().add_element_user(LICENSE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "license" element
         */
        public void removeLicense(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LICENSE$0, i);
            }
        }
    }
    /**
     * An XML profiles(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class ProfilesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Model.Profiles
    {
        private static final long serialVersionUID = 1L;
        
        public ProfilesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROFILE$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "profile");
        
        
        /**
         * Gets array of all "profile" elements
         */
        public org.apache.maven.pom.x400.Profile[] getProfileArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROFILE$0, targetList);
                org.apache.maven.pom.x400.Profile[] result = new org.apache.maven.pom.x400.Profile[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "profile" element
         */
        public org.apache.maven.pom.x400.Profile getProfileArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Profile target = null;
                target = (org.apache.maven.pom.x400.Profile)get_store().find_element_user(PROFILE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "profile" element
         */
        public int sizeOfProfileArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROFILE$0);
            }
        }
        
        /**
         * Sets array of all "profile" element
         */
        public void setProfileArray(org.apache.maven.pom.x400.Profile[] profileArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(profileArray, PROFILE$0);
            }
        }
        
        /**
         * Sets ith "profile" element
         */
        public void setProfileArray(int i, org.apache.maven.pom.x400.Profile profile)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Profile target = null;
                target = (org.apache.maven.pom.x400.Profile)get_store().find_element_user(PROFILE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(profile);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "profile" element
         */
        public org.apache.maven.pom.x400.Profile insertNewProfile(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Profile target = null;
                target = (org.apache.maven.pom.x400.Profile)get_store().insert_element_user(PROFILE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "profile" element
         */
        public org.apache.maven.pom.x400.Profile addNewProfile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Profile target = null;
                target = (org.apache.maven.pom.x400.Profile)get_store().add_element_user(PROFILE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "profile" element
         */
        public void removeProfile(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROFILE$0, i);
            }
        }
    }
    /**
     * An XML modules(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class ModulesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Model.Modules
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
    public static class RepositoriesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Model.Repositories
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
    public static class PluginRepositoriesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Model.PluginRepositories
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
    public static class DependenciesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Model.Dependencies
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
    public static class ReportsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Model.Reports
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
    public static class PropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Model.Properties
    {
        private static final long serialVersionUID = 1L;
        
        public PropertiesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
