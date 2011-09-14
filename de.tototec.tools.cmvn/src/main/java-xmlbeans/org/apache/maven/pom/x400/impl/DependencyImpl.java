/*
 * XML Type:  Dependency
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.Dependency
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * An XML Dependency(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public class DependencyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Dependency
{
    private static final long serialVersionUID = 1L;
    
    public DependencyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPID$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "groupId");
    private static final javax.xml.namespace.QName ARTIFACTID$2 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "artifactId");
    private static final javax.xml.namespace.QName VERSION$4 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "version");
    private static final javax.xml.namespace.QName TYPE$6 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "type");
    private static final javax.xml.namespace.QName CLASSIFIER$8 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "classifier");
    private static final javax.xml.namespace.QName SCOPE$10 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "scope");
    private static final javax.xml.namespace.QName SYSTEMPATH$12 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "systemPath");
    private static final javax.xml.namespace.QName EXCLUSIONS$14 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "exclusions");
    private static final javax.xml.namespace.QName OPTIONAL$16 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "optional");
    
    
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
     * Gets the "type" element
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$6) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$6);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$6);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$6, 0);
        }
    }
    
    /**
     * Gets the "classifier" element
     */
    public java.lang.String getClassifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSIFIER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "classifier" element
     */
    public org.apache.xmlbeans.XmlString xgetClassifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASSIFIER$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "classifier" element
     */
    public boolean isSetClassifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLASSIFIER$8) != 0;
        }
    }
    
    /**
     * Sets the "classifier" element
     */
    public void setClassifier(java.lang.String classifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSIFIER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLASSIFIER$8);
            }
            target.setStringValue(classifier);
        }
    }
    
    /**
     * Sets (as xml) the "classifier" element
     */
    public void xsetClassifier(org.apache.xmlbeans.XmlString classifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASSIFIER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLASSIFIER$8);
            }
            target.set(classifier);
        }
    }
    
    /**
     * Unsets the "classifier" element
     */
    public void unsetClassifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLASSIFIER$8, 0);
        }
    }
    
    /**
     * Gets the "scope" element
     */
    public java.lang.String getScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "scope" element
     */
    public org.apache.xmlbeans.XmlString xgetScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "scope" element
     */
    public boolean isSetScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCOPE$10) != 0;
        }
    }
    
    /**
     * Sets the "scope" element
     */
    public void setScope(java.lang.String scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCOPE$10);
            }
            target.setStringValue(scope);
        }
    }
    
    /**
     * Sets (as xml) the "scope" element
     */
    public void xsetScope(org.apache.xmlbeans.XmlString scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCOPE$10);
            }
            target.set(scope);
        }
    }
    
    /**
     * Unsets the "scope" element
     */
    public void unsetScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCOPE$10, 0);
        }
    }
    
    /**
     * Gets the "systemPath" element
     */
    public java.lang.String getSystemPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMPATH$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "systemPath" element
     */
    public org.apache.xmlbeans.XmlString xgetSystemPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYSTEMPATH$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "systemPath" element
     */
    public boolean isSetSystemPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYSTEMPATH$12) != 0;
        }
    }
    
    /**
     * Sets the "systemPath" element
     */
    public void setSystemPath(java.lang.String systemPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMPATH$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYSTEMPATH$12);
            }
            target.setStringValue(systemPath);
        }
    }
    
    /**
     * Sets (as xml) the "systemPath" element
     */
    public void xsetSystemPath(org.apache.xmlbeans.XmlString systemPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYSTEMPATH$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SYSTEMPATH$12);
            }
            target.set(systemPath);
        }
    }
    
    /**
     * Unsets the "systemPath" element
     */
    public void unsetSystemPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYSTEMPATH$12, 0);
        }
    }
    
    /**
     * Gets the "exclusions" element
     */
    public org.apache.maven.pom.x400.Dependency.Exclusions getExclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Dependency.Exclusions target = null;
            target = (org.apache.maven.pom.x400.Dependency.Exclusions)get_store().find_element_user(EXCLUSIONS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exclusions" element
     */
    public boolean isSetExclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXCLUSIONS$14) != 0;
        }
    }
    
    /**
     * Sets the "exclusions" element
     */
    public void setExclusions(org.apache.maven.pom.x400.Dependency.Exclusions exclusions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Dependency.Exclusions target = null;
            target = (org.apache.maven.pom.x400.Dependency.Exclusions)get_store().find_element_user(EXCLUSIONS$14, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Dependency.Exclusions)get_store().add_element_user(EXCLUSIONS$14);
            }
            target.set(exclusions);
        }
    }
    
    /**
     * Appends and returns a new empty "exclusions" element
     */
    public org.apache.maven.pom.x400.Dependency.Exclusions addNewExclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Dependency.Exclusions target = null;
            target = (org.apache.maven.pom.x400.Dependency.Exclusions)get_store().add_element_user(EXCLUSIONS$14);
            return target;
        }
    }
    
    /**
     * Unsets the "exclusions" element
     */
    public void unsetExclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXCLUSIONS$14, 0);
        }
    }
    
    /**
     * Gets the "optional" element
     */
    public boolean getOptional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPTIONAL$16, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "optional" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetOptional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OPTIONAL$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "optional" element
     */
    public boolean isSetOptional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPTIONAL$16) != 0;
        }
    }
    
    /**
     * Sets the "optional" element
     */
    public void setOptional(boolean optional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPTIONAL$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPTIONAL$16);
            }
            target.setBooleanValue(optional);
        }
    }
    
    /**
     * Sets (as xml) the "optional" element
     */
    public void xsetOptional(org.apache.xmlbeans.XmlBoolean optional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OPTIONAL$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(OPTIONAL$16);
            }
            target.set(optional);
        }
    }
    
    /**
     * Unsets the "optional" element
     */
    public void unsetOptional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPTIONAL$16, 0);
        }
    }
    /**
     * An XML exclusions(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class ExclusionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Dependency.Exclusions
    {
        private static final long serialVersionUID = 1L;
        
        public ExclusionsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EXCLUSION$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "exclusion");
        
        
        /**
         * Gets array of all "exclusion" elements
         */
        public org.apache.maven.pom.x400.Exclusion[] getExclusionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXCLUSION$0, targetList);
                org.apache.maven.pom.x400.Exclusion[] result = new org.apache.maven.pom.x400.Exclusion[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "exclusion" element
         */
        public org.apache.maven.pom.x400.Exclusion getExclusionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Exclusion target = null;
                target = (org.apache.maven.pom.x400.Exclusion)get_store().find_element_user(EXCLUSION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "exclusion" element
         */
        public int sizeOfExclusionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXCLUSION$0);
            }
        }
        
        /**
         * Sets array of all "exclusion" element
         */
        public void setExclusionArray(org.apache.maven.pom.x400.Exclusion[] exclusionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(exclusionArray, EXCLUSION$0);
            }
        }
        
        /**
         * Sets ith "exclusion" element
         */
        public void setExclusionArray(int i, org.apache.maven.pom.x400.Exclusion exclusion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Exclusion target = null;
                target = (org.apache.maven.pom.x400.Exclusion)get_store().find_element_user(EXCLUSION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(exclusion);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "exclusion" element
         */
        public org.apache.maven.pom.x400.Exclusion insertNewExclusion(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Exclusion target = null;
                target = (org.apache.maven.pom.x400.Exclusion)get_store().insert_element_user(EXCLUSION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "exclusion" element
         */
        public org.apache.maven.pom.x400.Exclusion addNewExclusion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Exclusion target = null;
                target = (org.apache.maven.pom.x400.Exclusion)get_store().add_element_user(EXCLUSION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "exclusion" element
         */
        public void removeExclusion(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXCLUSION$0, i);
            }
        }
    }
}
