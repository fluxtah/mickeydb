/**
 */
package com.justeat.mickeydb.mickeyLang.impl;

import com.justeat.mickeydb.mickeyLang.MickeyBlock;
import com.justeat.mickeydb.mickeyLang.MickeyFile;
import com.justeat.mickeydb.mickeyLang.MickeyLangPackage;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mickey File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.impl.MickeyFileImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.impl.MickeyFileImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.impl.MickeyFileImpl#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MickeyFileImpl extends MinimalEObjectImpl.Container implements MickeyFile
{
  /**
   * The default value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatabaseName()
   * @generated
   * @ordered
   */
  protected static final String DATABASE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatabaseName()
   * @generated
   * @ordered
   */
  protected String databaseName = DATABASE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final BigDecimal VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected BigDecimal version = VERSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocks()
   * @generated
   * @ordered
   */
  protected EList<MickeyBlock> blocks;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MickeyFileImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MickeyLangPackage.Literals.MICKEY_FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDatabaseName()
  {
    return databaseName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatabaseName(String newDatabaseName)
  {
    String oldDatabaseName = databaseName;
    databaseName = newDatabaseName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MickeyLangPackage.MICKEY_FILE__DATABASE_NAME, oldDatabaseName, databaseName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(BigDecimal newVersion)
  {
    BigDecimal oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MickeyLangPackage.MICKEY_FILE__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MickeyBlock> getBlocks()
  {
    if (blocks == null)
    {
      blocks = new EObjectContainmentEList<MickeyBlock>(MickeyBlock.class, this, MickeyLangPackage.MICKEY_FILE__BLOCKS);
    }
    return blocks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MickeyLangPackage.MICKEY_FILE__BLOCKS:
        return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MickeyLangPackage.MICKEY_FILE__DATABASE_NAME:
        return getDatabaseName();
      case MickeyLangPackage.MICKEY_FILE__VERSION:
        return getVersion();
      case MickeyLangPackage.MICKEY_FILE__BLOCKS:
        return getBlocks();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MickeyLangPackage.MICKEY_FILE__DATABASE_NAME:
        setDatabaseName((String)newValue);
        return;
      case MickeyLangPackage.MICKEY_FILE__VERSION:
        setVersion((BigDecimal)newValue);
        return;
      case MickeyLangPackage.MICKEY_FILE__BLOCKS:
        getBlocks().clear();
        getBlocks().addAll((Collection<? extends MickeyBlock>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MickeyLangPackage.MICKEY_FILE__DATABASE_NAME:
        setDatabaseName(DATABASE_NAME_EDEFAULT);
        return;
      case MickeyLangPackage.MICKEY_FILE__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case MickeyLangPackage.MICKEY_FILE__BLOCKS:
        getBlocks().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MickeyLangPackage.MICKEY_FILE__DATABASE_NAME:
        return DATABASE_NAME_EDEFAULT == null ? databaseName != null : !DATABASE_NAME_EDEFAULT.equals(databaseName);
      case MickeyLangPackage.MICKEY_FILE__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case MickeyLangPackage.MICKEY_FILE__BLOCKS:
        return blocks != null && !blocks.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (databaseName: ");
    result.append(databaseName);
    result.append(", version: ");
    result.append(version);
    result.append(')');
    return result.toString();
  }

} //MickeyFileImpl
