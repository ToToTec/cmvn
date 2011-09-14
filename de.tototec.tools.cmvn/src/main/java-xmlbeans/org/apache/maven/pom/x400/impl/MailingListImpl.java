/*
 * XML Type:  MailingList
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.MailingList
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * An XML MailingList(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public class MailingListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.MailingList
{
    private static final long serialVersionUID = 1L;
    
    public MailingListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "name");
    private static final javax.xml.namespace.QName SUBSCRIBE$2 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "subscribe");
    private static final javax.xml.namespace.QName UNSUBSCRIBE$4 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "unsubscribe");
    private static final javax.xml.namespace.QName POST$6 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "post");
    private static final javax.xml.namespace.QName ARCHIVE$8 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "archive");
    private static final javax.xml.namespace.QName OTHERARCHIVES$10 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "otherArchives");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
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
            return get_store().count_elements(NAME$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
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
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "subscribe" element
     */
    public java.lang.String getSubscribe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "subscribe" element
     */
    public org.apache.xmlbeans.XmlString xgetSubscribe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSCRIBE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "subscribe" element
     */
    public boolean isSetSubscribe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIBE$2) != 0;
        }
    }
    
    /**
     * Sets the "subscribe" element
     */
    public void setSubscribe(java.lang.String subscribe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSCRIBE$2);
            }
            target.setStringValue(subscribe);
        }
    }
    
    /**
     * Sets (as xml) the "subscribe" element
     */
    public void xsetSubscribe(org.apache.xmlbeans.XmlString subscribe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSCRIBE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBSCRIBE$2);
            }
            target.set(subscribe);
        }
    }
    
    /**
     * Unsets the "subscribe" element
     */
    public void unsetSubscribe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIBE$2, 0);
        }
    }
    
    /**
     * Gets the "unsubscribe" element
     */
    public java.lang.String getUnsubscribe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSUBSCRIBE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "unsubscribe" element
     */
    public org.apache.xmlbeans.XmlString xgetUnsubscribe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNSUBSCRIBE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "unsubscribe" element
     */
    public boolean isSetUnsubscribe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNSUBSCRIBE$4) != 0;
        }
    }
    
    /**
     * Sets the "unsubscribe" element
     */
    public void setUnsubscribe(java.lang.String unsubscribe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSUBSCRIBE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNSUBSCRIBE$4);
            }
            target.setStringValue(unsubscribe);
        }
    }
    
    /**
     * Sets (as xml) the "unsubscribe" element
     */
    public void xsetUnsubscribe(org.apache.xmlbeans.XmlString unsubscribe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNSUBSCRIBE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UNSUBSCRIBE$4);
            }
            target.set(unsubscribe);
        }
    }
    
    /**
     * Unsets the "unsubscribe" element
     */
    public void unsetUnsubscribe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNSUBSCRIBE$4, 0);
        }
    }
    
    /**
     * Gets the "post" element
     */
    public java.lang.String getPost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POST$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "post" element
     */
    public org.apache.xmlbeans.XmlString xgetPost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POST$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "post" element
     */
    public boolean isSetPost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POST$6) != 0;
        }
    }
    
    /**
     * Sets the "post" element
     */
    public void setPost(java.lang.String post)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POST$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POST$6);
            }
            target.setStringValue(post);
        }
    }
    
    /**
     * Sets (as xml) the "post" element
     */
    public void xsetPost(org.apache.xmlbeans.XmlString post)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POST$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POST$6);
            }
            target.set(post);
        }
    }
    
    /**
     * Unsets the "post" element
     */
    public void unsetPost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POST$6, 0);
        }
    }
    
    /**
     * Gets the "archive" element
     */
    public java.lang.String getArchive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARCHIVE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "archive" element
     */
    public org.apache.xmlbeans.XmlString xgetArchive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARCHIVE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "archive" element
     */
    public boolean isSetArchive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARCHIVE$8) != 0;
        }
    }
    
    /**
     * Sets the "archive" element
     */
    public void setArchive(java.lang.String archive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARCHIVE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARCHIVE$8);
            }
            target.setStringValue(archive);
        }
    }
    
    /**
     * Sets (as xml) the "archive" element
     */
    public void xsetArchive(org.apache.xmlbeans.XmlString archive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARCHIVE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARCHIVE$8);
            }
            target.set(archive);
        }
    }
    
    /**
     * Unsets the "archive" element
     */
    public void unsetArchive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARCHIVE$8, 0);
        }
    }
    
    /**
     * Gets the "otherArchives" element
     */
    public org.apache.maven.pom.x400.MailingList.OtherArchives getOtherArchives()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.MailingList.OtherArchives target = null;
            target = (org.apache.maven.pom.x400.MailingList.OtherArchives)get_store().find_element_user(OTHERARCHIVES$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "otherArchives" element
     */
    public boolean isSetOtherArchives()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OTHERARCHIVES$10) != 0;
        }
    }
    
    /**
     * Sets the "otherArchives" element
     */
    public void setOtherArchives(org.apache.maven.pom.x400.MailingList.OtherArchives otherArchives)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.MailingList.OtherArchives target = null;
            target = (org.apache.maven.pom.x400.MailingList.OtherArchives)get_store().find_element_user(OTHERARCHIVES$10, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.MailingList.OtherArchives)get_store().add_element_user(OTHERARCHIVES$10);
            }
            target.set(otherArchives);
        }
    }
    
    /**
     * Appends and returns a new empty "otherArchives" element
     */
    public org.apache.maven.pom.x400.MailingList.OtherArchives addNewOtherArchives()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.MailingList.OtherArchives target = null;
            target = (org.apache.maven.pom.x400.MailingList.OtherArchives)get_store().add_element_user(OTHERARCHIVES$10);
            return target;
        }
    }
    
    /**
     * Unsets the "otherArchives" element
     */
    public void unsetOtherArchives()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OTHERARCHIVES$10, 0);
        }
    }
    /**
     * An XML otherArchives(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class OtherArchivesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.MailingList.OtherArchives
    {
        private static final long serialVersionUID = 1L;
        
        public OtherArchivesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OTHERARCHIVE$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "otherArchive");
        
        
        /**
         * Gets array of all "otherArchive" elements
         */
        public java.lang.String[] getOtherArchiveArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OTHERARCHIVE$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "otherArchive" element
         */
        public java.lang.String getOtherArchiveArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTHERARCHIVE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "otherArchive" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetOtherArchiveArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OTHERARCHIVE$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "otherArchive" element
         */
        public org.apache.xmlbeans.XmlString xgetOtherArchiveArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OTHERARCHIVE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "otherArchive" element
         */
        public int sizeOfOtherArchiveArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OTHERARCHIVE$0);
            }
        }
        
        /**
         * Sets array of all "otherArchive" element
         */
        public void setOtherArchiveArray(java.lang.String[] otherArchiveArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(otherArchiveArray, OTHERARCHIVE$0);
            }
        }
        
        /**
         * Sets ith "otherArchive" element
         */
        public void setOtherArchiveArray(int i, java.lang.String otherArchive)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTHERARCHIVE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(otherArchive);
            }
        }
        
        /**
         * Sets (as xml) array of all "otherArchive" element
         */
        public void xsetOtherArchiveArray(org.apache.xmlbeans.XmlString[]otherArchiveArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(otherArchiveArray, OTHERARCHIVE$0);
            }
        }
        
        /**
         * Sets (as xml) ith "otherArchive" element
         */
        public void xsetOtherArchiveArray(int i, org.apache.xmlbeans.XmlString otherArchive)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OTHERARCHIVE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(otherArchive);
            }
        }
        
        /**
         * Inserts the value as the ith "otherArchive" element
         */
        public void insertOtherArchive(int i, java.lang.String otherArchive)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(OTHERARCHIVE$0, i);
                target.setStringValue(otherArchive);
            }
        }
        
        /**
         * Appends the value as the last "otherArchive" element
         */
        public void addOtherArchive(java.lang.String otherArchive)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OTHERARCHIVE$0);
                target.setStringValue(otherArchive);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "otherArchive" element
         */
        public org.apache.xmlbeans.XmlString insertNewOtherArchive(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(OTHERARCHIVE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "otherArchive" element
         */
        public org.apache.xmlbeans.XmlString addNewOtherArchive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OTHERARCHIVE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "otherArchive" element
         */
        public void removeOtherArchive(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OTHERARCHIVE$0, i);
            }
        }
    }
}
