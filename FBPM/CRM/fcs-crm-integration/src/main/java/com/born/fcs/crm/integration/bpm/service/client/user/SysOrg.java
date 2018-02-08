/**
 * SysOrg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.born.fcs.crm.integration.bpm.service.client.user;

public class SysOrg  extends com.born.fcs.crm.integration.bpm.service.client.user.BaseModel  implements java.io.Serializable {
    private java.lang.String code;

    private java.lang.String createName;

    private java.lang.Long creatorId;

    private java.lang.Long demId;

    private java.lang.String demName;

    private java.lang.Integer depth;

    private java.lang.Short fromType;

    private java.lang.String iconPath;

    private java.lang.Short isDelete;

    private java.lang.Integer isLeaf;

    private java.lang.String isParent;

    private java.lang.Short isPrimary;

    private java.lang.Short isRoot;

    private java.lang.Integer onlineNum;

    private java.lang.String open;

    private java.lang.String orgDesc;

    private java.lang.Long orgId;

    private java.lang.Integer orgLevel;

    private java.lang.String orgName;

    private java.lang.String orgPathname;

    private java.lang.Long orgSupId;

    private java.lang.String orgSupName;

    private java.lang.Long orgType;

    private java.lang.String ownUser;

    private java.lang.String ownUserName;

    private java.lang.String path;

    private java.lang.Long sn;

    private java.lang.String supCode;

    private java.lang.Long topOrgId;

    private java.lang.Long updateId;

    private java.lang.String updateName;

    public SysOrg() {
    }

    public SysOrg(
           java.lang.Long createBy,
           java.util.Calendar createtime,
           java.lang.Long updateBy,
           java.util.Calendar updatetime,
           java.lang.String code,
           java.lang.String createName,
           java.lang.Long creatorId,
           java.lang.Long demId,
           java.lang.String demName,
           java.lang.Integer depth,
           java.lang.Short fromType,
           java.lang.String iconPath,
           java.lang.Short isDelete,
           java.lang.Integer isLeaf,
           java.lang.String isParent,
           java.lang.Short isPrimary,
           java.lang.Short isRoot,
           java.lang.Integer onlineNum,
           java.lang.String open,
           java.lang.String orgDesc,
           java.lang.Long orgId,
           java.lang.Integer orgLevel,
           java.lang.String orgName,
           java.lang.String orgPathname,
           java.lang.Long orgSupId,
           java.lang.String orgSupName,
           java.lang.Long orgType,
           java.lang.String ownUser,
           java.lang.String ownUserName,
           java.lang.String path,
           java.lang.Long sn,
           java.lang.String supCode,
           java.lang.Long topOrgId,
           java.lang.Long updateId,
           java.lang.String updateName) {
        super(
            createBy,
            createtime,
            updateBy,
            updatetime);
        this.code = code;
        this.createName = createName;
        this.creatorId = creatorId;
        this.demId = demId;
        this.demName = demName;
        this.depth = depth;
        this.fromType = fromType;
        this.iconPath = iconPath;
        this.isDelete = isDelete;
        this.isLeaf = isLeaf;
        this.isParent = isParent;
        this.isPrimary = isPrimary;
        this.isRoot = isRoot;
        this.onlineNum = onlineNum;
        this.open = open;
        this.orgDesc = orgDesc;
        this.orgId = orgId;
        this.orgLevel = orgLevel;
        this.orgName = orgName;
        this.orgPathname = orgPathname;
        this.orgSupId = orgSupId;
        this.orgSupName = orgSupName;
        this.orgType = orgType;
        this.ownUser = ownUser;
        this.ownUserName = ownUserName;
        this.path = path;
        this.sn = sn;
        this.supCode = supCode;
        this.topOrgId = topOrgId;
        this.updateId = updateId;
        this.updateName = updateName;
    }


    /**
     * Gets the code value for this SysOrg.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this SysOrg.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the createName value for this SysOrg.
     * 
     * @return createName
     */
    public java.lang.String getCreateName() {
        return createName;
    }


    /**
     * Sets the createName value for this SysOrg.
     * 
     * @param createName
     */
    public void setCreateName(java.lang.String createName) {
        this.createName = createName;
    }


    /**
     * Gets the creatorId value for this SysOrg.
     * 
     * @return creatorId
     */
    public java.lang.Long getCreatorId() {
        return creatorId;
    }


    /**
     * Sets the creatorId value for this SysOrg.
     * 
     * @param creatorId
     */
    public void setCreatorId(java.lang.Long creatorId) {
        this.creatorId = creatorId;
    }


    /**
     * Gets the demId value for this SysOrg.
     * 
     * @return demId
     */
    public java.lang.Long getDemId() {
        return demId;
    }


    /**
     * Sets the demId value for this SysOrg.
     * 
     * @param demId
     */
    public void setDemId(java.lang.Long demId) {
        this.demId = demId;
    }


    /**
     * Gets the demName value for this SysOrg.
     * 
     * @return demName
     */
    public java.lang.String getDemName() {
        return demName;
    }


    /**
     * Sets the demName value for this SysOrg.
     * 
     * @param demName
     */
    public void setDemName(java.lang.String demName) {
        this.demName = demName;
    }


    /**
     * Gets the depth value for this SysOrg.
     * 
     * @return depth
     */
    public java.lang.Integer getDepth() {
        return depth;
    }


    /**
     * Sets the depth value for this SysOrg.
     * 
     * @param depth
     */
    public void setDepth(java.lang.Integer depth) {
        this.depth = depth;
    }


    /**
     * Gets the fromType value for this SysOrg.
     * 
     * @return fromType
     */
    public java.lang.Short getFromType() {
        return fromType;
    }


    /**
     * Sets the fromType value for this SysOrg.
     * 
     * @param fromType
     */
    public void setFromType(java.lang.Short fromType) {
        this.fromType = fromType;
    }


    /**
     * Gets the iconPath value for this SysOrg.
     * 
     * @return iconPath
     */
    public java.lang.String getIconPath() {
        return iconPath;
    }


    /**
     * Sets the iconPath value for this SysOrg.
     * 
     * @param iconPath
     */
    public void setIconPath(java.lang.String iconPath) {
        this.iconPath = iconPath;
    }


    /**
     * Gets the isDelete value for this SysOrg.
     * 
     * @return isDelete
     */
    public java.lang.Short getIsDelete() {
        return isDelete;
    }


    /**
     * Sets the isDelete value for this SysOrg.
     * 
     * @param isDelete
     */
    public void setIsDelete(java.lang.Short isDelete) {
        this.isDelete = isDelete;
    }


    /**
     * Gets the isLeaf value for this SysOrg.
     * 
     * @return isLeaf
     */
    public java.lang.Integer getIsLeaf() {
        return isLeaf;
    }


    /**
     * Sets the isLeaf value for this SysOrg.
     * 
     * @param isLeaf
     */
    public void setIsLeaf(java.lang.Integer isLeaf) {
        this.isLeaf = isLeaf;
    }


    /**
     * Gets the isParent value for this SysOrg.
     * 
     * @return isParent
     */
    public java.lang.String getIsParent() {
        return isParent;
    }


    /**
     * Sets the isParent value for this SysOrg.
     * 
     * @param isParent
     */
    public void setIsParent(java.lang.String isParent) {
        this.isParent = isParent;
    }


    /**
     * Gets the isPrimary value for this SysOrg.
     * 
     * @return isPrimary
     */
    public java.lang.Short getIsPrimary() {
        return isPrimary;
    }


    /**
     * Sets the isPrimary value for this SysOrg.
     * 
     * @param isPrimary
     */
    public void setIsPrimary(java.lang.Short isPrimary) {
        this.isPrimary = isPrimary;
    }


    /**
     * Gets the isRoot value for this SysOrg.
     * 
     * @return isRoot
     */
    public java.lang.Short getIsRoot() {
        return isRoot;
    }


    /**
     * Sets the isRoot value for this SysOrg.
     * 
     * @param isRoot
     */
    public void setIsRoot(java.lang.Short isRoot) {
        this.isRoot = isRoot;
    }


    /**
     * Gets the onlineNum value for this SysOrg.
     * 
     * @return onlineNum
     */
    public java.lang.Integer getOnlineNum() {
        return onlineNum;
    }


    /**
     * Sets the onlineNum value for this SysOrg.
     * 
     * @param onlineNum
     */
    public void setOnlineNum(java.lang.Integer onlineNum) {
        this.onlineNum = onlineNum;
    }


    /**
     * Gets the open value for this SysOrg.
     * 
     * @return open
     */
    public java.lang.String getOpen() {
        return open;
    }


    /**
     * Sets the open value for this SysOrg.
     * 
     * @param open
     */
    public void setOpen(java.lang.String open) {
        this.open = open;
    }


    /**
     * Gets the orgDesc value for this SysOrg.
     * 
     * @return orgDesc
     */
    public java.lang.String getOrgDesc() {
        return orgDesc;
    }


    /**
     * Sets the orgDesc value for this SysOrg.
     * 
     * @param orgDesc
     */
    public void setOrgDesc(java.lang.String orgDesc) {
        this.orgDesc = orgDesc;
    }


    /**
     * Gets the orgId value for this SysOrg.
     * 
     * @return orgId
     */
    public java.lang.Long getOrgId() {
        return orgId;
    }


    /**
     * Sets the orgId value for this SysOrg.
     * 
     * @param orgId
     */
    public void setOrgId(java.lang.Long orgId) {
        this.orgId = orgId;
    }


    /**
     * Gets the orgLevel value for this SysOrg.
     * 
     * @return orgLevel
     */
    public java.lang.Integer getOrgLevel() {
        return orgLevel;
    }


    /**
     * Sets the orgLevel value for this SysOrg.
     * 
     * @param orgLevel
     */
    public void setOrgLevel(java.lang.Integer orgLevel) {
        this.orgLevel = orgLevel;
    }


    /**
     * Gets the orgName value for this SysOrg.
     * 
     * @return orgName
     */
    public java.lang.String getOrgName() {
        return orgName;
    }


    /**
     * Sets the orgName value for this SysOrg.
     * 
     * @param orgName
     */
    public void setOrgName(java.lang.String orgName) {
        this.orgName = orgName;
    }


    /**
     * Gets the orgPathname value for this SysOrg.
     * 
     * @return orgPathname
     */
    public java.lang.String getOrgPathname() {
        return orgPathname;
    }


    /**
     * Sets the orgPathname value for this SysOrg.
     * 
     * @param orgPathname
     */
    public void setOrgPathname(java.lang.String orgPathname) {
        this.orgPathname = orgPathname;
    }


    /**
     * Gets the orgSupId value for this SysOrg.
     * 
     * @return orgSupId
     */
    public java.lang.Long getOrgSupId() {
        return orgSupId;
    }


    /**
     * Sets the orgSupId value for this SysOrg.
     * 
     * @param orgSupId
     */
    public void setOrgSupId(java.lang.Long orgSupId) {
        this.orgSupId = orgSupId;
    }


    /**
     * Gets the orgSupName value for this SysOrg.
     * 
     * @return orgSupName
     */
    public java.lang.String getOrgSupName() {
        return orgSupName;
    }


    /**
     * Sets the orgSupName value for this SysOrg.
     * 
     * @param orgSupName
     */
    public void setOrgSupName(java.lang.String orgSupName) {
        this.orgSupName = orgSupName;
    }


    /**
     * Gets the orgType value for this SysOrg.
     * 
     * @return orgType
     */
    public java.lang.Long getOrgType() {
        return orgType;
    }


    /**
     * Sets the orgType value for this SysOrg.
     * 
     * @param orgType
     */
    public void setOrgType(java.lang.Long orgType) {
        this.orgType = orgType;
    }


    /**
     * Gets the ownUser value for this SysOrg.
     * 
     * @return ownUser
     */
    public java.lang.String getOwnUser() {
        return ownUser;
    }


    /**
     * Sets the ownUser value for this SysOrg.
     * 
     * @param ownUser
     */
    public void setOwnUser(java.lang.String ownUser) {
        this.ownUser = ownUser;
    }


    /**
     * Gets the ownUserName value for this SysOrg.
     * 
     * @return ownUserName
     */
    public java.lang.String getOwnUserName() {
        return ownUserName;
    }


    /**
     * Sets the ownUserName value for this SysOrg.
     * 
     * @param ownUserName
     */
    public void setOwnUserName(java.lang.String ownUserName) {
        this.ownUserName = ownUserName;
    }


    /**
     * Gets the path value for this SysOrg.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this SysOrg.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the sn value for this SysOrg.
     * 
     * @return sn
     */
    public java.lang.Long getSn() {
        return sn;
    }


    /**
     * Sets the sn value for this SysOrg.
     * 
     * @param sn
     */
    public void setSn(java.lang.Long sn) {
        this.sn = sn;
    }


    /**
     * Gets the supCode value for this SysOrg.
     * 
     * @return supCode
     */
    public java.lang.String getSupCode() {
        return supCode;
    }


    /**
     * Sets the supCode value for this SysOrg.
     * 
     * @param supCode
     */
    public void setSupCode(java.lang.String supCode) {
        this.supCode = supCode;
    }


    /**
     * Gets the topOrgId value for this SysOrg.
     * 
     * @return topOrgId
     */
    public java.lang.Long getTopOrgId() {
        return topOrgId;
    }


    /**
     * Sets the topOrgId value for this SysOrg.
     * 
     * @param topOrgId
     */
    public void setTopOrgId(java.lang.Long topOrgId) {
        this.topOrgId = topOrgId;
    }


    /**
     * Gets the updateId value for this SysOrg.
     * 
     * @return updateId
     */
    public java.lang.Long getUpdateId() {
        return updateId;
    }


    /**
     * Sets the updateId value for this SysOrg.
     * 
     * @param updateId
     */
    public void setUpdateId(java.lang.Long updateId) {
        this.updateId = updateId;
    }


    /**
     * Gets the updateName value for this SysOrg.
     * 
     * @return updateName
     */
    public java.lang.String getUpdateName() {
        return updateName;
    }


    /**
     * Sets the updateName value for this SysOrg.
     * 
     * @param updateName
     */
    public void setUpdateName(java.lang.String updateName) {
        this.updateName = updateName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SysOrg)) return false;
        SysOrg other = (SysOrg) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.createName==null && other.getCreateName()==null) || 
             (this.createName!=null &&
              this.createName.equals(other.getCreateName()))) &&
            ((this.creatorId==null && other.getCreatorId()==null) || 
             (this.creatorId!=null &&
              this.creatorId.equals(other.getCreatorId()))) &&
            ((this.demId==null && other.getDemId()==null) || 
             (this.demId!=null &&
              this.demId.equals(other.getDemId()))) &&
            ((this.demName==null && other.getDemName()==null) || 
             (this.demName!=null &&
              this.demName.equals(other.getDemName()))) &&
            ((this.depth==null && other.getDepth()==null) || 
             (this.depth!=null &&
              this.depth.equals(other.getDepth()))) &&
            ((this.fromType==null && other.getFromType()==null) || 
             (this.fromType!=null &&
              this.fromType.equals(other.getFromType()))) &&
            ((this.iconPath==null && other.getIconPath()==null) || 
             (this.iconPath!=null &&
              this.iconPath.equals(other.getIconPath()))) &&
            ((this.isDelete==null && other.getIsDelete()==null) || 
             (this.isDelete!=null &&
              this.isDelete.equals(other.getIsDelete()))) &&
            ((this.isLeaf==null && other.getIsLeaf()==null) || 
             (this.isLeaf!=null &&
              this.isLeaf.equals(other.getIsLeaf()))) &&
            ((this.isParent==null && other.getIsParent()==null) || 
             (this.isParent!=null &&
              this.isParent.equals(other.getIsParent()))) &&
            ((this.isPrimary==null && other.getIsPrimary()==null) || 
             (this.isPrimary!=null &&
              this.isPrimary.equals(other.getIsPrimary()))) &&
            ((this.isRoot==null && other.getIsRoot()==null) || 
             (this.isRoot!=null &&
              this.isRoot.equals(other.getIsRoot()))) &&
            ((this.onlineNum==null && other.getOnlineNum()==null) || 
             (this.onlineNum!=null &&
              this.onlineNum.equals(other.getOnlineNum()))) &&
            ((this.open==null && other.getOpen()==null) || 
             (this.open!=null &&
              this.open.equals(other.getOpen()))) &&
            ((this.orgDesc==null && other.getOrgDesc()==null) || 
             (this.orgDesc!=null &&
              this.orgDesc.equals(other.getOrgDesc()))) &&
            ((this.orgId==null && other.getOrgId()==null) || 
             (this.orgId!=null &&
              this.orgId.equals(other.getOrgId()))) &&
            ((this.orgLevel==null && other.getOrgLevel()==null) || 
             (this.orgLevel!=null &&
              this.orgLevel.equals(other.getOrgLevel()))) &&
            ((this.orgName==null && other.getOrgName()==null) || 
             (this.orgName!=null &&
              this.orgName.equals(other.getOrgName()))) &&
            ((this.orgPathname==null && other.getOrgPathname()==null) || 
             (this.orgPathname!=null &&
              this.orgPathname.equals(other.getOrgPathname()))) &&
            ((this.orgSupId==null && other.getOrgSupId()==null) || 
             (this.orgSupId!=null &&
              this.orgSupId.equals(other.getOrgSupId()))) &&
            ((this.orgSupName==null && other.getOrgSupName()==null) || 
             (this.orgSupName!=null &&
              this.orgSupName.equals(other.getOrgSupName()))) &&
            ((this.orgType==null && other.getOrgType()==null) || 
             (this.orgType!=null &&
              this.orgType.equals(other.getOrgType()))) &&
            ((this.ownUser==null && other.getOwnUser()==null) || 
             (this.ownUser!=null &&
              this.ownUser.equals(other.getOwnUser()))) &&
            ((this.ownUserName==null && other.getOwnUserName()==null) || 
             (this.ownUserName!=null &&
              this.ownUserName.equals(other.getOwnUserName()))) &&
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.sn==null && other.getSn()==null) || 
             (this.sn!=null &&
              this.sn.equals(other.getSn()))) &&
            ((this.supCode==null && other.getSupCode()==null) || 
             (this.supCode!=null &&
              this.supCode.equals(other.getSupCode()))) &&
            ((this.topOrgId==null && other.getTopOrgId()==null) || 
             (this.topOrgId!=null &&
              this.topOrgId.equals(other.getTopOrgId()))) &&
            ((this.updateId==null && other.getUpdateId()==null) || 
             (this.updateId!=null &&
              this.updateId.equals(other.getUpdateId()))) &&
            ((this.updateName==null && other.getUpdateName()==null) || 
             (this.updateName!=null &&
              this.updateName.equals(other.getUpdateName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getCreateName() != null) {
            _hashCode += getCreateName().hashCode();
        }
        if (getCreatorId() != null) {
            _hashCode += getCreatorId().hashCode();
        }
        if (getDemId() != null) {
            _hashCode += getDemId().hashCode();
        }
        if (getDemName() != null) {
            _hashCode += getDemName().hashCode();
        }
        if (getDepth() != null) {
            _hashCode += getDepth().hashCode();
        }
        if (getFromType() != null) {
            _hashCode += getFromType().hashCode();
        }
        if (getIconPath() != null) {
            _hashCode += getIconPath().hashCode();
        }
        if (getIsDelete() != null) {
            _hashCode += getIsDelete().hashCode();
        }
        if (getIsLeaf() != null) {
            _hashCode += getIsLeaf().hashCode();
        }
        if (getIsParent() != null) {
            _hashCode += getIsParent().hashCode();
        }
        if (getIsPrimary() != null) {
            _hashCode += getIsPrimary().hashCode();
        }
        if (getIsRoot() != null) {
            _hashCode += getIsRoot().hashCode();
        }
        if (getOnlineNum() != null) {
            _hashCode += getOnlineNum().hashCode();
        }
        if (getOpen() != null) {
            _hashCode += getOpen().hashCode();
        }
        if (getOrgDesc() != null) {
            _hashCode += getOrgDesc().hashCode();
        }
        if (getOrgId() != null) {
            _hashCode += getOrgId().hashCode();
        }
        if (getOrgLevel() != null) {
            _hashCode += getOrgLevel().hashCode();
        }
        if (getOrgName() != null) {
            _hashCode += getOrgName().hashCode();
        }
        if (getOrgPathname() != null) {
            _hashCode += getOrgPathname().hashCode();
        }
        if (getOrgSupId() != null) {
            _hashCode += getOrgSupId().hashCode();
        }
        if (getOrgSupName() != null) {
            _hashCode += getOrgSupName().hashCode();
        }
        if (getOrgType() != null) {
            _hashCode += getOrgType().hashCode();
        }
        if (getOwnUser() != null) {
            _hashCode += getOwnUser().hashCode();
        }
        if (getOwnUserName() != null) {
            _hashCode += getOwnUserName().hashCode();
        }
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        if (getSn() != null) {
            _hashCode += getSn().hashCode();
        }
        if (getSupCode() != null) {
            _hashCode += getSupCode().hashCode();
        }
        if (getTopOrgId() != null) {
            _hashCode += getTopOrgId().hashCode();
        }
        if (getUpdateId() != null) {
            _hashCode += getUpdateId().hashCode();
        }
        if (getUpdateName() != null) {
            _hashCode += getUpdateName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SysOrg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://impl.webservice.platform.gcdata.com/", "sysOrg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creatorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "demId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "demName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iconPath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iconPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isLeaf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isLeaf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isParent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isParent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPrimary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isPrimary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRoot");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isRoot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlineNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "onlineNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("open");
        elemField.setXmlName(new javax.xml.namespace.QName("", "open"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgPathname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgPathname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgSupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgSupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgSupName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgSupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownUserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topOrgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topOrgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
