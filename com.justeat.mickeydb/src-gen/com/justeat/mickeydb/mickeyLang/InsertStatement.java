/**
 */
package com.justeat.mickeydb.mickeyLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.InsertStatement#getConflictResolution <em>Conflict Resolution</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.InsertStatement#getTable <em>Table</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.InsertStatement#getColumnNames <em>Column Names</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.InsertStatement#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.InsertStatement#getSelectStatement <em>Select Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getInsertStatement()
 * @model
 * @generated
 */
public interface InsertStatement extends DMLStatement
{
  /**
   * Returns the value of the '<em><b>Conflict Resolution</b></em>' attribute.
   * The literals are from the enumeration {@link com.justeat.mickeydb.mickeyLang.ConflictResolution}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conflict Resolution</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conflict Resolution</em>' attribute.
   * @see com.justeat.mickeydb.mickeyLang.ConflictResolution
   * @see #setConflictResolution(ConflictResolution)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getInsertStatement_ConflictResolution()
   * @model
   * @generated
   */
  ConflictResolution getConflictResolution();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.InsertStatement#getConflictResolution <em>Conflict Resolution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conflict Resolution</em>' attribute.
   * @see com.justeat.mickeydb.mickeyLang.ConflictResolution
   * @see #getConflictResolution()
   * @generated
   */
  void setConflictResolution(ConflictResolution value);

  /**
   * Returns the value of the '<em><b>Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' reference.
   * @see #setTable(TableDefinition)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getInsertStatement_Table()
   * @model
   * @generated
   */
  TableDefinition getTable();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.InsertStatement#getTable <em>Table</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' reference.
   * @see #getTable()
   * @generated
   */
  void setTable(TableDefinition value);

  /**
   * Returns the value of the '<em><b>Column Names</b></em>' reference list.
   * The list contents are of type {@link com.justeat.mickeydb.mickeyLang.ColumnDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Names</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Names</em>' reference list.
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getInsertStatement_ColumnNames()
   * @model
   * @generated
   */
  EList<ColumnDef> getColumnNames();

  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link com.justeat.mickeydb.mickeyLang.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getInsertStatement_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpressions();

  /**
   * Returns the value of the '<em><b>Select Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Select Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select Statement</em>' containment reference.
   * @see #setSelectStatement(SelectStatement)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getInsertStatement_SelectStatement()
   * @model containment="true"
   * @generated
   */
  SelectStatement getSelectStatement();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.InsertStatement#getSelectStatement <em>Select Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select Statement</em>' containment reference.
   * @see #getSelectStatement()
   * @generated
   */
  void setSelectStatement(SelectStatement value);

} // InsertStatement
