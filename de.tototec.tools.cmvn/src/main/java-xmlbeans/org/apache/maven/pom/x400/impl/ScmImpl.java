/*
 * XML Type:  Scm
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.Scm
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * An XML Scm(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public class ScmImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Scm
{
    private static final long serialVersionUID = 1L;
    
    public ScmImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONNECTION$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "connection");
    private static final javax.xml.namespace.QName DEVELOPERCONNECTION$2 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "developerConnection");
    private static final javax.xml.namespace.QName TAG$4 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "tag");
    private static final javax.xml.namespace.QName URL$6 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "url");
    
    
    /**
     * Gets the "connection" element
     */
    public java.lang.String getConnection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONNECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "connection" element
     */
    public org.apache.xmlbeans.XmlString xgetConnection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONNECTION$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "connection" element
     */
    public boolean isSetConnection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONNECTION$0) != 0;
        }
    }
    
    /**
     * Sets the "connection" element
     */
    public void setConnection(java.lang.String connection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONNECTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONNECTION$0);
            }
            target.setStringValue(connection);
        }
    }
    
    /**
     * Sets (as xml) the "connection" element
     */
    public void xsetConnection(org.apache.xmlbeans.XmlString connection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONNECTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONNECTION$0);
            }
            target.set(connection);
        }
    }
    
    /**
     * Unsets the "connection" element
     */
    public void unsetConnection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONNECTION$0, 0);
        }
    }
    
    /**
     * Gets the "developerConnection" element
     */
    public java.lang.String getDeveloperConnection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEVELOPERCONNECTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "developerConnection" element
     */
    public org.apache.xmlbeans.XmlString xgetDeveloperConnection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEVELOPERCONNECTION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "developerConnection" element
     */
    public boolean isSetDeveloperConnection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEVELOPERCONNECTION$2) != 0;
        }
    }
    
    /**
     * Sets the "developerConnection" element
     */
    public void setDeveloperConnection(java.lang.String developerConnection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEVELOPERCONNECTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEVELOPERCONNECTION$2);
            }
            target.setStringValue(developerConnection);
        }
    }
    
    /**
     * Sets (as xml) the "developerConnection" element
     */
    public void xsetDeveloperConnection(org.apache.xmlbeans.XmlString developerConnection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEVELOPERCONNECTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEVELOPERCONNECTION$2);
            }
            target.set(developerConnection);
        }
    }
    
    /**
     * Unsets the "developerConnection" element
     */
    public void unsetDeveloperConnection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEVELOPERCONNECTION$2, 0);
        }
    }
    
    /**
     * Gets the "tag" element
     */
    public java.lang.String getTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAG$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tag" element
     */
    public org.apache.xmlbeans.XmlString xgetTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TAG$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "tag" element
     */
    public boolean isSetTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TAG$4) != 0;
        }
    }
    
    /**
     * Sets the "tag" element
     */
    public void setTag(java.lang.String tag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAG$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAG$4);
            }
            target.setStringValue(tag);
        }
    }
    
    /**
     * Sets (as xml) the "tag" element
     */
    public void xsetTag(org.apache.xmlbeans.XmlString tag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TAG$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TAG$4);
            }
            target.set(tag);
        }
    }
    
    /**
     * Unsets the "tag" element
     */
    public void unsetTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TAG$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$6, 0);
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
            return get_store().count_elements(URL$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URL$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URL$6);
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
            get_store().remove_element(URL$6, 0);
        }
    }
}
