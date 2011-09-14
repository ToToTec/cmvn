/*
 * XML Type:  Parent
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.Parent
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * An XML Parent(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public class ParentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Parent
{
    private static final long serialVersionUID = 1L;
    
    public ParentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARTIFACTID$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "artifactId");
    private static final javax.xml.namespace.QName GROUPID$2 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "groupId");
    private static final javax.xml.namespace.QName VERSION$4 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "version");
    private static final javax.xml.namespace.QName RELATIVEPATH$6 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "relativePath");
    
    
    /**
     * Gets the "artifactId" element
     */
    public java.lang.String getArtifactId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARTIFACTID$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARTIFACTID$0, 0);
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
            return get_store().count_elements(ARTIFACTID$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARTIFACTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARTIFACTID$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARTIFACTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARTIFACTID$0);
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
            get_store().remove_element(ARTIFACTID$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPID$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPID$2, 0);
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
            return get_store().count_elements(GROUPID$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUPID$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GROUPID$2);
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
            get_store().remove_element(GROUPID$2, 0);
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
     * Gets the "relativePath" element
     */
    public java.lang.String getRelativePath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIVEPATH$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "relativePath" element
     */
    public org.apache.xmlbeans.XmlString xgetRelativePath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIVEPATH$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "relativePath" element
     */
    public boolean isSetRelativePath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATIVEPATH$6) != 0;
        }
    }
    
    /**
     * Sets the "relativePath" element
     */
    public void setRelativePath(java.lang.String relativePath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIVEPATH$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATIVEPATH$6);
            }
            target.setStringValue(relativePath);
        }
    }
    
    /**
     * Sets (as xml) the "relativePath" element
     */
    public void xsetRelativePath(org.apache.xmlbeans.XmlString relativePath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIVEPATH$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELATIVEPATH$6);
            }
            target.set(relativePath);
        }
    }
    
    /**
     * Unsets the "relativePath" element
     */
    public void unsetRelativePath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATIVEPATH$6, 0);
        }
    }
}
