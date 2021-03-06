/**
 */
package com.justeat.mickeydb.mickeyLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cast Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.CastExpression#getExpression <em>Expression</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.CastExpression#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getCastExpression()
 * @model
 * @generated
 */
public interface CastExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getCastExpression_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.CastExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link com.justeat.mickeydb.mickeyLang.SqliteDataType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see com.justeat.mickeydb.mickeyLang.SqliteDataType
   * @see #setType(SqliteDataType)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getCastExpression_Type()
   * @model
   * @generated
   */
  SqliteDataType getType();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.CastExpression#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see com.justeat.mickeydb.mickeyLang.SqliteDataType
   * @see #getType()
   * @generated
   */
  void setType(SqliteDataType value);

} // CastExpression
