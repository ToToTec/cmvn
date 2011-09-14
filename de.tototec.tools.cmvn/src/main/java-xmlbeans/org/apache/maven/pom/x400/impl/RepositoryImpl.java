/*
 * XML Type:  Repository
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.Repository
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * An XML Repository(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public class RepositoryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Repository
{
    private static final long serialVersionUID = 1L;
    
    public RepositoryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELEASES$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "releases");
    private static final javax.xml.namespace.QName SNAPSHOTS$2 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "snapshots");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "id");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "name");
    private static final javax.xml.namespace.QName URL$8 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "url");
    private static final javax.xml.namespace.QName LAYOUT$10 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "layout");
    
    
    /**
     * Gets the "releases" element
     */
    public org.apache.maven.pom.x400.RepositoryPolicy getReleases()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.RepositoryPolicy target = null;
            target = (org.apache.maven.pom.x400.RepositoryPolicy)get_store().find_element_user(RELEASES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "releases" element
     */
    public boolean isSetReleases()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELEASES$0) != 0;
        }
    }
    
    /**
     * Sets the "releases" element
     */
    public void setReleases(org.apache.maven.pom.x400.RepositoryPolicy releases)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.RepositoryPolicy target = null;
            target = (org.apache.maven.pom.x400.RepositoryPolicy)get_store().find_element_user(RELEASES$0, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.RepositoryPolicy)get_store().add_element_user(RELEASES$0);
            }
            target.set(releases);
        }
    }
    
    /**
     * Appends and returns a new empty "releases" element
     */
    public org.apache.maven.pom.x400.RepositoryPolicy addNewReleases()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.RepositoryPolicy target = null;
            target = (org.apache.maven.pom.x400.RepositoryPolicy)get_store().add_element_user(RELEASES$0);
            return target;
        }
    }
    
    /**
     * Unsets the "releases" element
     */
    public void unsetReleases()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELEASES$0, 0);
        }
    }
    
    /**
     * Gets the "snapshots" element
     */
    public org.apache.maven.pom.x400.RepositoryPolicy getSnapshots()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.RepositoryPolicy target = null;
            target = (org.apache.maven.pom.x400.RepositoryPolicy)get_store().find_element_user(SNAPSHOTS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "snapshots" element
     */
    public boolean isSetSnapshots()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SNAPSHOTS$2) != 0;
        }
    }
    
    /**
     * Sets the "snapshots" element
     */
    public void setSnapshots(org.apache.maven.pom.x400.RepositoryPolicy snapshots)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.RepositoryPolicy target = null;
            target = (org.apache.maven.pom.x400.RepositoryPolicy)get_store().find_element_user(SNAPSHOTS$2, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.RepositoryPolicy)get_store().add_element_user(SNAPSHOTS$2);
            }
            target.set(snapshots);
        }
    }
    
    /**
     * Appends and returns a new empty "snapshots" element
     */
    public org.apache.maven.pom.x400.RepositoryPolicy addNewSnapshots()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.RepositoryPolicy target = null;
            target = (org.apache.maven.pom.x400.RepositoryPolicy)get_store().add_element_user(SNAPSHOTS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "snapshots" element
     */
    public void unsetSnapshots()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SNAPSHOTS$2, 0);
        }
    }
    
    /**
     * Gets the "id" element
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$4, 0);
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
            return get_store().count_elements(ID$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$4);
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
            get_store().remove_element(ID$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$6, 0);
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
            return get_store().count_elements(NAME$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$6);
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
            get_store().remove_element(NAME$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$8, 0);
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
            return get_store().count_elements(URL$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URL$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URL$8);
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
            get_store().remove_element(URL$8, 0);
        }
    }
    
    /**
     * Gets the "layout" element
     */
    public java.lang.String getLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAYOUT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "layout" element
     */
    public org.apache.xmlbeans.XmlString xgetLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LAYOUT$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "layout" element
     */
    public boolean isSetLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LAYOUT$10) != 0;
        }
    }
    
    /**
     * Sets the "layout" element
     */
    public void setLayout(java.lang.String layout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAYOUT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAYOUT$10);
            }
            target.setStringValue(layout);
        }
    }
    
    /**
     * Sets (as xml) the "layout" element
     */
    public void xsetLayout(org.apache.xmlbeans.XmlString layout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LAYOUT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LAYOUT$10);
            }
            target.set(layout);
        }
    }
    
    /**
     * Unsets the "layout" element
     */
    public void unsetLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LAYOUT$10, 0);
        }
    }
}
