// Generated from org/ossreviewtoolkit/utils/spdx/SpdxExpression.g4 by ANTLR 4.13.0

package org.ossreviewtoolkit.utils.spdx;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SpdxExpressionParser}.
 */
public interface SpdxExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SpdxExpressionParser#licenseReferenceExpression}.
	 * @param ctx the parse tree
	 */
	void enterLicenseReferenceExpression(SpdxExpressionParser.LicenseReferenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpdxExpressionParser#licenseReferenceExpression}.
	 * @param ctx the parse tree
	 */
	void exitLicenseReferenceExpression(SpdxExpressionParser.LicenseReferenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpdxExpressionParser#licenseIdExpression}.
	 * @param ctx the parse tree
	 */
	void enterLicenseIdExpression(SpdxExpressionParser.LicenseIdExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpdxExpressionParser#licenseIdExpression}.
	 * @param ctx the parse tree
	 */
	void exitLicenseIdExpression(SpdxExpressionParser.LicenseIdExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpdxExpressionParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(SpdxExpressionParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpdxExpressionParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(SpdxExpressionParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpdxExpressionParser#compoundExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompoundExpression(SpdxExpressionParser.CompoundExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpdxExpressionParser#compoundExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompoundExpression(SpdxExpressionParser.CompoundExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpdxExpressionParser#licenseExpression}.
	 * @param ctx the parse tree
	 */
	void enterLicenseExpression(SpdxExpressionParser.LicenseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpdxExpressionParser#licenseExpression}.
	 * @param ctx the parse tree
	 */
	void exitLicenseExpression(SpdxExpressionParser.LicenseExpressionContext ctx);
}
