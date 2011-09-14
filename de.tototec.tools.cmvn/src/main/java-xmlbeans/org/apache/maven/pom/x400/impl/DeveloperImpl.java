/*
 * XML Type:  Developer
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.Developer
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * An XML Developer(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public class DeveloperImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Developer
{
    private static final long serialVersionUID = 1L;
    
    public DeveloperImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "id");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "name");
    private static final javax.xml.namespace.QName EMAIL$4 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "email");
    private static final javax.xml.namespace.QName URL$6 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "url");
    private static final javax.xml.namespace.QName ORGANIZATION$8 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "organization");
    private static final javax.xml.namespace.QName ORGANIZATIONURL$10 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "organizationUrl");
    private static final javax.xml.namespace.QName ROLES$12 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "roles");
    private static final javax.xml.namespace.QName TIMEZONE$14 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "timezone");
    private static final javax.xml.namespace.QName PROPERTIES$16 = 
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
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
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
            return get_store().count_elements(NAME$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
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
            get_store().remove_element(NAME$2, 0);
        }
    }
    
    /**
     * Gets the "email" element
     */
    public java.lang.String getEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "email" element
     */
    public org.apache.xmlbeans.XmlString xgetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "email" element
     */
    public boolean isSetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAIL$4) != 0;
        }
    }
    
    /**
     * Sets the "email" element
     */
    public void setEmail(java.lang.String email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$4);
            }
            target.setStringValue(email);
        }
    }
    
    /**
     * Sets (as xml) the "email" element
     */
    public void xsetEmail(org.apache.xmlbeans.XmlString email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$4);
            }
            target.set(email);
        }
    }
    
    /**
     * Unsets the "email" element
     */
    public void unsetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAIL$4, 0);
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
    
    /**
     * Gets the "organization" element
     */
    public java.lang.String getOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "organization" element
     */
    public org.apache.xmlbeans.XmlString xgetOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZATION$8, 0);
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
            return get_store().count_elements(ORGANIZATION$8) != 0;
        }
    }
    
    /**
     * Sets the "organization" element
     */
    public void setOrganization(java.lang.String organization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANIZATION$8);
            }
            target.setStringValue(organization);
        }
    }
    
    /**
     * Sets (as xml) the "organization" element
     */
    public void xsetOrganization(org.apache.xmlbeans.XmlString organization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZATION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORGANIZATION$8);
            }
            target.set(organization);
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
            get_store().remove_element(ORGANIZATION$8, 0);
        }
    }
    
    /**
     * Gets the "organizationUrl" element
     */
    public java.lang.String getOrganizationUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATIONURL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "organizationUrl" element
     */
    public org.apache.xmlbeans.XmlString xgetOrganizationUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZATIONURL$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "organizationUrl" element
     */
    public boolean isSetOrganizationUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONURL$10) != 0;
        }
    }
    
    /**
     * Sets the "organizationUrl" element
     */
    public void setOrganizationUrl(java.lang.String organizationUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATIONURL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANIZATIONURL$10);
            }
            target.setStringValue(organizationUrl);
        }
    }
    
    /**
     * Sets (as xml) the "organizationUrl" element
     */
    public void xsetOrganizationUrl(org.apache.xmlbeans.XmlString organizationUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZATIONURL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORGANIZATIONURL$10);
            }
            target.set(organizationUrl);
        }
    }
    
    /**
     * Unsets the "organizationUrl" element
     */
    public void unsetOrganizationUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONURL$10, 0);
        }
    }
    
    /**
     * Gets the "roles" element
     */
    public org.apache.maven.pom.x400.Developer.Roles getRoles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Developer.Roles target = null;
            target = (org.apache.maven.pom.x400.Developer.Roles)get_store().find_element_user(ROLES$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "roles" element
     */
    public boolean isSetRoles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLES$12) != 0;
        }
    }
    
    /**
     * Sets the "roles" element
     */
    public void setRoles(org.apache.maven.pom.x400.Developer.Roles roles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Developer.Roles target = null;
            target = (org.apache.maven.pom.x400.Developer.Roles)get_store().find_element_user(ROLES$12, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Developer.Roles)get_store().add_element_user(ROLES$12);
            }
            target.set(roles);
        }
    }
    
    /**
     * Appends and returns a new empty "roles" element
     */
    public org.apache.maven.pom.x400.Developer.Roles addNewRoles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Developer.Roles target = null;
            target = (org.apache.maven.pom.x400.Developer.Roles)get_store().add_element_user(ROLES$12);
            return target;
        }
    }
    
    /**
     * Unsets the "roles" element
     */
    public void unsetRoles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLES$12, 0);
        }
    }
    
    /**
     * Gets the "timezone" element
     */
    public java.lang.String getTimezone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEZONE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "timezone" element
     */
    public org.apache.xmlbeans.XmlString xgetTimezone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIMEZONE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "timezone" element
     */
    public boolean isSetTimezone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONE$14) != 0;
        }
    }
    
    /**
     * Sets the "timezone" element
     */
    public void setTimezone(java.lang.String timezone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEZONE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMEZONE$14);
            }
            target.setStringValue(timezone);
        }
    }
    
    /**
     * Sets (as xml) the "timezone" element
     */
    public void xsetTimezone(org.apache.xmlbeans.XmlString timezone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIMEZONE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIMEZONE$14);
            }
            target.set(timezone);
        }
    }
    
    /**
     * Unsets the "timezone" element
     */
    public void unsetTimezone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONE$14, 0);
        }
    }
    
    /**
     * Gets the "properties" element
     */
    public org.apache.maven.pom.x400.Developer.Properties getProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Developer.Properties target = null;
            target = (org.apache.maven.pom.x400.Developer.Properties)get_store().find_element_user(PROPERTIES$16, 0);
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
            return get_store().count_elements(PROPERTIES$16) != 0;
        }
    }
    
    /**
     * Sets the "properties" element
     */
    public void setProperties(org.apache.maven.pom.x400.Developer.Properties properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Developer.Properties target = null;
            target = (org.apache.maven.pom.x400.Developer.Properties)get_store().find_element_user(PROPERTIES$16, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Developer.Properties)get_store().add_element_user(PROPERTIES$16);
            }
            target.set(properties);
        }
    }
    
    /**
     * Appends and returns a new empty "properties" element
     */
    public org.apache.maven.pom.x400.Developer.Properties addNewProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Developer.Properties target = null;
            target = (org.apache.maven.pom.x400.Developer.Properties)get_store().add_element_user(PROPERTIES$16);
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
            get_store().remove_element(PROPERTIES$16, 0);
        }
    }
    /**
     * An XML roles(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class RolesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Developer.Roles
    {
        private static final long serialVersionUID = 1L;
        
        public RolesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROLE$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "role");
        
        
        /**
         * Gets array of all "role" elements
         */
        public java.lang.String[] getRoleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ROLE$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "role" element
         */
        public java.lang.String getRoleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "role" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetRoleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ROLE$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "role" element
         */
        public org.apache.xmlbeans.XmlString xgetRoleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROLE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "role" element
         */
        public int sizeOfRoleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ROLE$0);
            }
        }
        
        /**
         * Sets array of all "role" element
         */
        public void setRoleArray(java.lang.String[] roleArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(roleArray, ROLE$0);
            }
        }
        
        /**
         * Sets ith "role" element
         */
        public void setRoleArray(int i, java.lang.String role)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(role);
            }
        }
        
        /**
         * Sets (as xml) array of all "role" element
         */
        public void xsetRoleArray(org.apache.xmlbeans.XmlString[]roleArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(roleArray, ROLE$0);
            }
        }
        
        /**
         * Sets (as xml) ith "role" element
         */
        public void xsetRoleArray(int i, org.apache.xmlbeans.XmlString role)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROLE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(role);
            }
        }
        
        /**
         * Inserts the value as the ith "role" element
         */
        public void insertRole(int i, java.lang.String role)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ROLE$0, i);
                target.setStringValue(role);
            }
        }
        
        /**
         * Appends the value as the last "role" element
         */
        public void addRole(java.lang.String role)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROLE$0);
                target.setStringValue(role);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "role" element
         */
        public org.apache.xmlbeans.XmlString insertNewRole(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ROLE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "role" element
         */
        public org.apache.xmlbeans.XmlString addNewRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ROLE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "role" element
         */
        public void removeRole(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ROLE$0, i);
            }
        }
    }
    /**
     * An XML properties(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class PropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Developer.Properties
    {
        private static final long serialVersionUID = 1L;
        
        public PropertiesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
