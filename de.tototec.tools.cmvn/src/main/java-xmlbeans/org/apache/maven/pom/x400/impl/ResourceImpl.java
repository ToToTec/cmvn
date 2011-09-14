/*
 * XML Type:  Resource
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.Resource
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * An XML Resource(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public class ResourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Resource
{
    private static final long serialVersionUID = 1L;
    
    public ResourceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGETPATH$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "targetPath");
    private static final javax.xml.namespace.QName FILTERING$2 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "filtering");
    private static final javax.xml.namespace.QName DIRECTORY$4 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "directory");
    private static final javax.xml.namespace.QName INCLUDES$6 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "includes");
    private static final javax.xml.namespace.QName EXCLUDES$8 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "excludes");
    
    
    /**
     * Gets the "targetPath" element
     */
    public java.lang.String getTargetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETPATH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetPath" element
     */
    public org.apache.xmlbeans.XmlString xgetTargetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETPATH$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "targetPath" element
     */
    public boolean isSetTargetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETPATH$0) != 0;
        }
    }
    
    /**
     * Sets the "targetPath" element
     */
    public void setTargetPath(java.lang.String targetPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETPATH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETPATH$0);
            }
            target.setStringValue(targetPath);
        }
    }
    
    /**
     * Sets (as xml) the "targetPath" element
     */
    public void xsetTargetPath(org.apache.xmlbeans.XmlString targetPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETPATH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETPATH$0);
            }
            target.set(targetPath);
        }
    }
    
    /**
     * Unsets the "targetPath" element
     */
    public void unsetTargetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETPATH$0, 0);
        }
    }
    
    /**
     * Gets the "filtering" element
     */
    public boolean getFiltering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILTERING$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "filtering" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetFiltering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FILTERING$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "filtering" element
     */
    public boolean isSetFiltering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTERING$2) != 0;
        }
    }
    
    /**
     * Sets the "filtering" element
     */
    public void setFiltering(boolean filtering)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILTERING$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILTERING$2);
            }
            target.setBooleanValue(filtering);
        }
    }
    
    /**
     * Sets (as xml) the "filtering" element
     */
    public void xsetFiltering(org.apache.xmlbeans.XmlBoolean filtering)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FILTERING$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(FILTERING$2);
            }
            target.set(filtering);
        }
    }
    
    /**
     * Unsets the "filtering" element
     */
    public void unsetFiltering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTERING$2, 0);
        }
    }
    
    /**
     * Gets the "directory" element
     */
    public java.lang.String getDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTORY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "directory" element
     */
    public org.apache.xmlbeans.XmlString xgetDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTORY$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "directory" element
     */
    public boolean isSetDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTORY$4) != 0;
        }
    }
    
    /**
     * Sets the "directory" element
     */
    public void setDirectory(java.lang.String directory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTORY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRECTORY$4);
            }
            target.setStringValue(directory);
        }
    }
    
    /**
     * Sets (as xml) the "directory" element
     */
    public void xsetDirectory(org.apache.xmlbeans.XmlString directory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTORY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIRECTORY$4);
            }
            target.set(directory);
        }
    }
    
    /**
     * Unsets the "directory" element
     */
    public void unsetDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTORY$4, 0);
        }
    }
    
    /**
     * Gets the "includes" element
     */
    public org.apache.maven.pom.x400.Resource.Includes getIncludes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Resource.Includes target = null;
            target = (org.apache.maven.pom.x400.Resource.Includes)get_store().find_element_user(INCLUDES$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "includes" element
     */
    public boolean isSetIncludes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCLUDES$6) != 0;
        }
    }
    
    /**
     * Sets the "includes" element
     */
    public void setIncludes(org.apache.maven.pom.x400.Resource.Includes includes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Resource.Includes target = null;
            target = (org.apache.maven.pom.x400.Resource.Includes)get_store().find_element_user(INCLUDES$6, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Resource.Includes)get_store().add_element_user(INCLUDES$6);
            }
            target.set(includes);
        }
    }
    
    /**
     * Appends and returns a new empty "includes" element
     */
    public org.apache.maven.pom.x400.Resource.Includes addNewIncludes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Resource.Includes target = null;
            target = (org.apache.maven.pom.x400.Resource.Includes)get_store().add_element_user(INCLUDES$6);
            return target;
        }
    }
    
    /**
     * Unsets the "includes" element
     */
    public void unsetIncludes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCLUDES$6, 0);
        }
    }
    
    /**
     * Gets the "excludes" element
     */
    public org.apache.maven.pom.x400.Resource.Excludes getExcludes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Resource.Excludes target = null;
            target = (org.apache.maven.pom.x400.Resource.Excludes)get_store().find_element_user(EXCLUDES$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "excludes" element
     */
    public boolean isSetExcludes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXCLUDES$8) != 0;
        }
    }
    
    /**
     * Sets the "excludes" element
     */
    public void setExcludes(org.apache.maven.pom.x400.Resource.Excludes excludes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Resource.Excludes target = null;
            target = (org.apache.maven.pom.x400.Resource.Excludes)get_store().find_element_user(EXCLUDES$8, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Resource.Excludes)get_store().add_element_user(EXCLUDES$8);
            }
            target.set(excludes);
        }
    }
    
    /**
     * Appends and returns a new empty "excludes" element
     */
    public org.apache.maven.pom.x400.Resource.Excludes addNewExcludes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Resource.Excludes target = null;
            target = (org.apache.maven.pom.x400.Resource.Excludes)get_store().add_element_user(EXCLUDES$8);
            return target;
        }
    }
    
    /**
     * Unsets the "excludes" element
     */
    public void unsetExcludes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXCLUDES$8, 0);
        }
    }
    /**
     * An XML includes(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class IncludesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Resource.Includes
    {
        private static final long serialVersionUID = 1L;
        
        public IncludesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCLUDE$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "include");
        
        
        /**
         * Gets array of all "include" elements
         */
        public java.lang.String[] getIncludeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INCLUDE$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "include" element
         */
        public java.lang.String getIncludeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "include" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetIncludeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INCLUDE$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "include" element
         */
        public org.apache.xmlbeans.XmlString xgetIncludeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCLUDE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "include" element
         */
        public int sizeOfIncludeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INCLUDE$0);
            }
        }
        
        /**
         * Sets array of all "include" element
         */
        public void setIncludeArray(java.lang.String[] includeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(includeArray, INCLUDE$0);
            }
        }
        
        /**
         * Sets ith "include" element
         */
        public void setIncludeArray(int i, java.lang.String include)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(include);
            }
        }
        
        /**
         * Sets (as xml) array of all "include" element
         */
        public void xsetIncludeArray(org.apache.xmlbeans.XmlString[]includeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(includeArray, INCLUDE$0);
            }
        }
        
        /**
         * Sets (as xml) ith "include" element
         */
        public void xsetIncludeArray(int i, org.apache.xmlbeans.XmlString include)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCLUDE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(include);
            }
        }
        
        /**
         * Inserts the value as the ith "include" element
         */
        public void insertInclude(int i, java.lang.String include)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(INCLUDE$0, i);
                target.setStringValue(include);
            }
        }
        
        /**
         * Appends the value as the last "include" element
         */
        public void addInclude(java.lang.String include)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCLUDE$0);
                target.setStringValue(include);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "include" element
         */
        public org.apache.xmlbeans.XmlString insertNewInclude(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(INCLUDE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "include" element
         */
        public org.apache.xmlbeans.XmlString addNewInclude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCLUDE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "include" element
         */
        public void removeInclude(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INCLUDE$0, i);
            }
        }
    }
    /**
     * An XML excludes(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class ExcludesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Resource.Excludes
    {
        private static final long serialVersionUID = 1L;
        
        public ExcludesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EXCLUDE$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "exclude");
        
        
        /**
         * Gets array of all "exclude" elements
         */
        public java.lang.String[] getExcludeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXCLUDE$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "exclude" element
         */
        public java.lang.String getExcludeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCLUDE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "exclude" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetExcludeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXCLUDE$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "exclude" element
         */
        public org.apache.xmlbeans.XmlString xgetExcludeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXCLUDE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "exclude" element
         */
        public int sizeOfExcludeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXCLUDE$0);
            }
        }
        
        /**
         * Sets array of all "exclude" element
         */
        public void setExcludeArray(java.lang.String[] excludeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(excludeArray, EXCLUDE$0);
            }
        }
        
        /**
         * Sets ith "exclude" element
         */
        public void setExcludeArray(int i, java.lang.String exclude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCLUDE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(exclude);
            }
        }
        
        /**
         * Sets (as xml) array of all "exclude" element
         */
        public void xsetExcludeArray(org.apache.xmlbeans.XmlString[]excludeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(excludeArray, EXCLUDE$0);
            }
        }
        
        /**
         * Sets (as xml) ith "exclude" element
         */
        public void xsetExcludeArray(int i, org.apache.xmlbeans.XmlString exclude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXCLUDE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(exclude);
            }
        }
        
        /**
         * Inserts the value as the ith "exclude" element
         */
        public void insertExclude(int i, java.lang.String exclude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(EXCLUDE$0, i);
                target.setStringValue(exclude);
            }
        }
        
        /**
         * Appends the value as the last "exclude" element
         */
        public void addExclude(java.lang.String exclude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXCLUDE$0);
                target.setStringValue(exclude);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "exclude" element
         */
        public org.apache.xmlbeans.XmlString insertNewExclude(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(EXCLUDE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "exclude" element
         */
        public org.apache.xmlbeans.XmlString addNewExclude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXCLUDE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "exclude" element
         */
        public void removeExclude(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXCLUDE$0, i);
            }
        }
    }
}
