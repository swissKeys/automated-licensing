// Generated from org/ossreviewtoolkit/utils/spdx/SpdxExpression.g4 by ANTLR 4.13.0

package org.ossreviewtoolkit.utils.spdx;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SpdxExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SpdxExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SpdxExpressionParser#licenseReferenceExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLicenseReferenceExpression(SpdxExpressionParser.LicenseReferenceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpdxExpressionParser#licenseIdExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLicenseIdExpression(SpdxExpressionParser.LicenseIdExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpdxExpressionParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(SpdxExpressionParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpdxExpressionParser#compoundExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundExpression(SpdxExpressionParser.CompoundExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpdxExpressionParser#licenseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLicenseExpression(SpdxExpressionParser.LicenseExpressionContext ctx);
}
