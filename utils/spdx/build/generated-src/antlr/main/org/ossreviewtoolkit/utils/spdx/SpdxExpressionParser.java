// Generated from org/ossreviewtoolkit/utils/spdx/SpdxExpression.g4 by ANTLR 4.13.0

package org.ossreviewtoolkit.utils.spdx;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SpdxExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, WITH=3, OPEN=4, CLOSE=5, PLUS=6, DOCUMENTREFERENCE=7, LICENSEREFERENCE=8, 
		IDSTRING=9, WHITESPACE=10;
	public static final int
		RULE_licenseReferenceExpression = 0, RULE_licenseIdExpression = 1, RULE_simpleExpression = 2, 
		RULE_compoundExpression = 3, RULE_licenseExpression = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"licenseReferenceExpression", "licenseIdExpression", "simpleExpression", 
			"compoundExpression", "licenseExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'('", "')'", "'+'", null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "WITH", "OPEN", "CLOSE", "PLUS", "DOCUMENTREFERENCE", 
			"LICENSEREFERENCE", "IDSTRING", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SpdxExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SpdxExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LicenseReferenceExpressionContext extends ParserRuleContext {
		public TerminalNode DOCUMENTREFERENCE() { return getToken(SpdxExpressionParser.DOCUMENTREFERENCE, 0); }
		public TerminalNode LICENSEREFERENCE() { return getToken(SpdxExpressionParser.LICENSEREFERENCE, 0); }
		public LicenseReferenceExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_licenseReferenceExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpdxExpressionListener ) ((SpdxExpressionListener)listener).enterLicenseReferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpdxExpressionListener ) ((SpdxExpressionListener)listener).exitLicenseReferenceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpdxExpressionVisitor ) return ((SpdxExpressionVisitor<? extends T>)visitor).visitLicenseReferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LicenseReferenceExpressionContext licenseReferenceExpression() throws RecognitionException {
		LicenseReferenceExpressionContext _localctx = new LicenseReferenceExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_licenseReferenceExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			_la = _input.LA(1);
			if ( !(_la==DOCUMENTREFERENCE || _la==LICENSEREFERENCE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LicenseIdExpressionContext extends ParserRuleContext {
		public TerminalNode IDSTRING() { return getToken(SpdxExpressionParser.IDSTRING, 0); }
		public TerminalNode PLUS() { return getToken(SpdxExpressionParser.PLUS, 0); }
		public LicenseIdExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_licenseIdExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpdxExpressionListener ) ((SpdxExpressionListener)listener).enterLicenseIdExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpdxExpressionListener ) ((SpdxExpressionListener)listener).exitLicenseIdExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpdxExpressionVisitor ) return ((SpdxExpressionVisitor<? extends T>)visitor).visitLicenseIdExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LicenseIdExpressionContext licenseIdExpression() throws RecognitionException {
		LicenseIdExpressionContext _localctx = new LicenseIdExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_licenseIdExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(IDSTRING);
			setState(14);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(13);
				match(PLUS);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExpressionContext extends ParserRuleContext {
		public LicenseReferenceExpressionContext licenseReferenceExpression() {
			return getRuleContext(LicenseReferenceExpressionContext.class,0);
		}
		public LicenseIdExpressionContext licenseIdExpression() {
			return getRuleContext(LicenseIdExpressionContext.class,0);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpdxExpressionListener ) ((SpdxExpressionListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpdxExpressionListener ) ((SpdxExpressionListener)listener).exitSimpleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpdxExpressionVisitor ) return ((SpdxExpressionVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleExpression);
		try {
			setState(18);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOCUMENTREFERENCE:
			case LICENSEREFERENCE:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				licenseReferenceExpression();
				}
				break;
			case IDSTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				licenseIdExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundExpressionContext extends ParserRuleContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SpdxExpressionParser.WITH, 0); }
		public TerminalNode IDSTRING() { return getToken(SpdxExpressionParser.IDSTRING, 0); }
		public TerminalNode LICENSEREFERENCE() { return getToken(SpdxExpressionParser.LICENSEREFERENCE, 0); }
		public TerminalNode OPEN() { return getToken(SpdxExpressionParser.OPEN, 0); }
		public List<CompoundExpressionContext> compoundExpression() {
			return getRuleContexts(CompoundExpressionContext.class);
		}
		public CompoundExpressionContext compoundExpression(int i) {
			return getRuleContext(CompoundExpressionContext.class,i);
		}
		public TerminalNode CLOSE() { return getToken(SpdxExpressionParser.CLOSE, 0); }
		public TerminalNode AND() { return getToken(SpdxExpressionParser.AND, 0); }
		public TerminalNode OR() { return getToken(SpdxExpressionParser.OR, 0); }
		public CompoundExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpdxExpressionListener ) ((SpdxExpressionListener)listener).enterCompoundExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpdxExpressionListener ) ((SpdxExpressionListener)listener).exitCompoundExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpdxExpressionVisitor ) return ((SpdxExpressionVisitor<? extends T>)visitor).visitCompoundExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundExpressionContext compoundExpression() throws RecognitionException {
		return compoundExpression(0);
	}

	private CompoundExpressionContext compoundExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CompoundExpressionContext _localctx = new CompoundExpressionContext(_ctx, _parentState);
		CompoundExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_compoundExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(21);
				simpleExpression();
				}
				break;
			case 2:
				{
				setState(22);
				simpleExpression();
				setState(23);
				match(WITH);
				setState(24);
				_la = _input.LA(1);
				if ( !(_la==LICENSEREFERENCE || _la==IDSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				setState(26);
				match(OPEN);
				setState(27);
				compoundExpression(0);
				setState(28);
				match(CLOSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(38);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new CompoundExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_compoundExpression);
						setState(32);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(33);
						match(AND);
						setState(34);
						compoundExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new CompoundExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_compoundExpression);
						setState(35);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(36);
						match(OR);
						setState(37);
						compoundExpression(3);
						}
						break;
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LicenseExpressionContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SpdxExpressionParser.EOF, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public CompoundExpressionContext compoundExpression() {
			return getRuleContext(CompoundExpressionContext.class,0);
		}
		public LicenseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_licenseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpdxExpressionListener ) ((SpdxExpressionListener)listener).enterLicenseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpdxExpressionListener ) ((SpdxExpressionListener)listener).exitLicenseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpdxExpressionVisitor ) return ((SpdxExpressionVisitor<? extends T>)visitor).visitLicenseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LicenseExpressionContext licenseExpression() throws RecognitionException {
		LicenseExpressionContext _localctx = new LicenseExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_licenseExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(43);
				simpleExpression();
				}
				break;
			case 2:
				{
				setState(44);
				compoundExpression(0);
				}
				break;
			}
			setState(47);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return compoundExpression_sempred((CompoundExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean compoundExpression_sempred(CompoundExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\n2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u000f\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u0013\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u001f\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\'\b\u0003\n\u0003"+
		"\f\u0003*\t\u0003\u0001\u0004\u0001\u0004\u0003\u0004.\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0000\u0001\u0006\u0005\u0000\u0002\u0004\u0006"+
		"\b\u0000\u0002\u0001\u0000\u0007\b\u0001\u0000\b\t3\u0000\n\u0001\u0000"+
		"\u0000\u0000\u0002\f\u0001\u0000\u0000\u0000\u0004\u0012\u0001\u0000\u0000"+
		"\u0000\u0006\u001e\u0001\u0000\u0000\u0000\b-\u0001\u0000\u0000\u0000"+
		"\n\u000b\u0007\u0000\u0000\u0000\u000b\u0001\u0001\u0000\u0000\u0000\f"+
		"\u000e\u0005\t\u0000\u0000\r\u000f\u0005\u0006\u0000\u0000\u000e\r\u0001"+
		"\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\u0003\u0001"+
		"\u0000\u0000\u0000\u0010\u0013\u0003\u0000\u0000\u0000\u0011\u0013\u0003"+
		"\u0002\u0001\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0012\u0011\u0001"+
		"\u0000\u0000\u0000\u0013\u0005\u0001\u0000\u0000\u0000\u0014\u0015\u0006"+
		"\u0003\uffff\uffff\u0000\u0015\u001f\u0003\u0004\u0002\u0000\u0016\u0017"+
		"\u0003\u0004\u0002\u0000\u0017\u0018\u0005\u0003\u0000\u0000\u0018\u0019"+
		"\u0007\u0001\u0000\u0000\u0019\u001f\u0001\u0000\u0000\u0000\u001a\u001b"+
		"\u0005\u0004\u0000\u0000\u001b\u001c\u0003\u0006\u0003\u0000\u001c\u001d"+
		"\u0005\u0005\u0000\u0000\u001d\u001f\u0001\u0000\u0000\u0000\u001e\u0014"+
		"\u0001\u0000\u0000\u0000\u001e\u0016\u0001\u0000\u0000\u0000\u001e\u001a"+
		"\u0001\u0000\u0000\u0000\u001f(\u0001\u0000\u0000\u0000 !\n\u0003\u0000"+
		"\u0000!\"\u0005\u0001\u0000\u0000\"\'\u0003\u0006\u0003\u0004#$\n\u0002"+
		"\u0000\u0000$%\u0005\u0002\u0000\u0000%\'\u0003\u0006\u0003\u0003& \u0001"+
		"\u0000\u0000\u0000&#\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000"+
		"(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\u0007\u0001\u0000"+
		"\u0000\u0000*(\u0001\u0000\u0000\u0000+.\u0003\u0004\u0002\u0000,.\u0003"+
		"\u0006\u0003\u0000-+\u0001\u0000\u0000\u0000-,\u0001\u0000\u0000\u0000"+
		"./\u0001\u0000\u0000\u0000/0\u0005\u0000\u0000\u00010\t\u0001\u0000\u0000"+
		"\u0000\u0006\u000e\u0012\u001e&(-";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
