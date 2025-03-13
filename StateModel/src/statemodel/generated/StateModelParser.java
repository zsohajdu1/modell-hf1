// Generated from D:/Documents/modell/modell-hf1/StateModel/src/statemodel/StateModel.g4 by ANTLR 4.13.2
package statemodel.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class StateModelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STATES=1, TRANSITIONS=2, INITIAL=3, ERROR=4, NORMAL=5, COLON=6, ARROW=7, 
		TRANS=8, ID=9, LCURLY=10, RCURLY=11, COMMA=12, LINE_COMMENT=13, BLOCK_COMMENT=14, 
		WS=15;
	public static final int
		RULE_model = 0, RULE_states = 1, RULE_initialState = 2, RULE_state = 3, 
		RULE_errorState = 4, RULE_labels = 5, RULE_labelList = 6, RULE_transitions = 7, 
		RULE_transitionDefinition = 8, RULE_type = 9, RULE_transition = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"model", "states", "initialState", "state", "errorState", "labels", "labelList", 
			"transitions", "transitionDefinition", "type", "transition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'states'", "'transitions'", "'initial'", "'error'", "'normal'", 
			"':'", "'->'", "'trans'", null, "'{'", "'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STATES", "TRANSITIONS", "INITIAL", "ERROR", "NORMAL", "COLON", 
			"ARROW", "TRANS", "ID", "LCURLY", "RCURLY", "COMMA", "LINE_COMMENT", 
			"BLOCK_COMMENT", "WS"
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
	public String getGrammarFileName() { return "StateModel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StateModelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModelContext extends ParserRuleContext {
		public StatesContext states() {
			return getRuleContext(StatesContext.class,0);
		}
		public TransitionsContext transitions() {
			return getRuleContext(TransitionsContext.class,0);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			states();
			setState(23);
			transitions();
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
	public static class StatesContext extends ParserRuleContext {
		public TerminalNode STATES() { return getToken(StateModelParser.STATES, 0); }
		public TerminalNode LCURLY() { return getToken(StateModelParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(StateModelParser.RCURLY, 0); }
		public InitialStateContext initialState() {
			return getRuleContext(InitialStateContext.class,0);
		}
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public StatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_states; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterStates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitStates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitStates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatesContext states() throws RecognitionException {
		StatesContext _localctx = new StatesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_states);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(STATES);
			setState(26);
			match(LCURLY);
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INITIAL) {
				{
				setState(27);
				initialState();
				}
			}

			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(30);
				state();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			match(RCURLY);
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
	public static class InitialStateContext extends ParserRuleContext {
		public TerminalNode INITIAL() { return getToken(StateModelParser.INITIAL, 0); }
		public TerminalNode ID() { return getToken(StateModelParser.ID, 0); }
		public LabelsContext labels() {
			return getRuleContext(LabelsContext.class,0);
		}
		public InitialStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterInitialState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitInitialState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitInitialState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialStateContext initialState() throws RecognitionException {
		InitialStateContext _localctx = new InitialStateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_initialState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(INITIAL);
			setState(39);
			match(ID);
			setState(40);
			labels();
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
	public static class StateContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StateModelParser.ID, 0); }
		public LabelsContext labels() {
			return getRuleContext(LabelsContext.class,0);
		}
		public ErrorStateContext errorState() {
			return getRuleContext(ErrorStateContext.class,0);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(ID);
			setState(43);
			labels();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ERROR) {
				{
				setState(44);
				errorState();
				}
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
	public static class ErrorStateContext extends ParserRuleContext {
		public TerminalNode ERROR() { return getToken(StateModelParser.ERROR, 0); }
		public ErrorStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterErrorState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitErrorState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitErrorState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorStateContext errorState() throws RecognitionException {
		ErrorStateContext _localctx = new ErrorStateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_errorState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(ERROR);
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
	public static class LabelsContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(StateModelParser.LCURLY, 0); }
		public LabelListContext labelList() {
			return getRuleContext(LabelListContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(StateModelParser.RCURLY, 0); }
		public LabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitLabels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitLabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelsContext labels() throws RecognitionException {
		LabelsContext _localctx = new LabelsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_labels);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(LCURLY);
			setState(50);
			labelList();
			setState(51);
			match(RCURLY);
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
	public static class LabelListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(StateModelParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(StateModelParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StateModelParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StateModelParser.COMMA, i);
		}
		public LabelListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterLabelList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitLabelList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitLabelList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelListContext labelList() throws RecognitionException {
		LabelListContext _localctx = new LabelListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_labelList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(53);
				match(ID);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(54);
					match(COMMA);
					setState(55);
					match(ID);
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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
	public static class TransitionsContext extends ParserRuleContext {
		public TerminalNode TRANSITIONS() { return getToken(StateModelParser.TRANSITIONS, 0); }
		public TerminalNode LCURLY() { return getToken(StateModelParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(StateModelParser.RCURLY, 0); }
		public List<TransitionDefinitionContext> transitionDefinition() {
			return getRuleContexts(TransitionDefinitionContext.class);
		}
		public TransitionDefinitionContext transitionDefinition(int i) {
			return getRuleContext(TransitionDefinitionContext.class,i);
		}
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public TransitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterTransitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitTransitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitTransitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionsContext transitions() throws RecognitionException {
		TransitionsContext _localctx = new TransitionsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_transitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(TRANSITIONS);
			setState(64);
			match(LCURLY);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TRANS) {
				{
				{
				setState(65);
				transitionDefinition();
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(66);
					transition();
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(RCURLY);
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
	public static class TransitionDefinitionContext extends ParserRuleContext {
		public TerminalNode TRANS() { return getToken(StateModelParser.TRANS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(StateModelParser.ID, 0); }
		public TransitionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterTransitionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitTransitionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitTransitionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionDefinitionContext transitionDefinition() throws RecognitionException {
		TransitionDefinitionContext _localctx = new TransitionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_transitionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(TRANS);
			setState(80);
			type();
			setState(81);
			match(ID);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode NORMAL() { return getToken(StateModelParser.NORMAL, 0); }
		public TerminalNode ERROR() { return getToken(StateModelParser.ERROR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ( !(_la==ERROR || _la==NORMAL) ) {
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
	public static class TransitionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(StateModelParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(StateModelParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(StateModelParser.COLON, 0); }
		public TerminalNode ARROW() { return getToken(StateModelParser.ARROW, 0); }
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitTransition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitTransition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_transition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(ID);
			setState(86);
			match(COLON);
			setState(87);
			match(ID);
			setState(88);
			match(ARROW);
			setState(89);
			match(ID);
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

	public static final String _serializedATN =
		"\u0004\u0001\u000f\\\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001d\b\u0001\u0001"+
		"\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003.\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u00069\b\u0006\n\u0006\f\u0006<\t\u0006\u0003\u0006>\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007D\b\u0007"+
		"\n\u0007\f\u0007G\t\u0007\u0005\u0007I\b\u0007\n\u0007\f\u0007L\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0000\u0000"+
		"\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0001"+
		"\u0001\u0000\u0004\u0005W\u0000\u0016\u0001\u0000\u0000\u0000\u0002\u0019"+
		"\u0001\u0000\u0000\u0000\u0004&\u0001\u0000\u0000\u0000\u0006*\u0001\u0000"+
		"\u0000\u0000\b/\u0001\u0000\u0000\u0000\n1\u0001\u0000\u0000\u0000\f="+
		"\u0001\u0000\u0000\u0000\u000e?\u0001\u0000\u0000\u0000\u0010O\u0001\u0000"+
		"\u0000\u0000\u0012S\u0001\u0000\u0000\u0000\u0014U\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0003\u0002\u0001\u0000\u0017\u0018\u0003\u000e\u0007\u0000"+
		"\u0018\u0001\u0001\u0000\u0000\u0000\u0019\u001a\u0005\u0001\u0000\u0000"+
		"\u001a\u001c\u0005\n\u0000\u0000\u001b\u001d\u0003\u0004\u0002\u0000\u001c"+
		"\u001b\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d"+
		"!\u0001\u0000\u0000\u0000\u001e \u0003\u0006\u0003\u0000\u001f\u001e\u0001"+
		"\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000"+
		"\u0000!\"\u0001\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000"+
		"\u0000\u0000$%\u0005\u000b\u0000\u0000%\u0003\u0001\u0000\u0000\u0000"+
		"&\'\u0005\u0003\u0000\u0000\'(\u0005\t\u0000\u0000()\u0003\n\u0005\u0000"+
		")\u0005\u0001\u0000\u0000\u0000*+\u0005\t\u0000\u0000+-\u0003\n\u0005"+
		"\u0000,.\u0003\b\u0004\u0000-,\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000"+
		"\u0000.\u0007\u0001\u0000\u0000\u0000/0\u0005\u0004\u0000\u00000\t\u0001"+
		"\u0000\u0000\u000012\u0005\n\u0000\u000023\u0003\f\u0006\u000034\u0005"+
		"\u000b\u0000\u00004\u000b\u0001\u0000\u0000\u00005:\u0005\t\u0000\u0000"+
		"67\u0005\f\u0000\u000079\u0005\t\u0000\u000086\u0001\u0000\u0000\u0000"+
		"9<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000"+
		"\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=5\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000>\r\u0001\u0000\u0000\u0000?@\u0005"+
		"\u0002\u0000\u0000@J\u0005\n\u0000\u0000AE\u0003\u0010\b\u0000BD\u0003"+
		"\u0014\n\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000HA\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000"+
		"\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000MN\u0005\u000b\u0000\u0000N\u000f"+
		"\u0001\u0000\u0000\u0000OP\u0005\b\u0000\u0000PQ\u0003\u0012\t\u0000Q"+
		"R\u0005\t\u0000\u0000R\u0011\u0001\u0000\u0000\u0000ST\u0007\u0000\u0000"+
		"\u0000T\u0013\u0001\u0000\u0000\u0000UV\u0005\t\u0000\u0000VW\u0005\u0006"+
		"\u0000\u0000WX\u0005\t\u0000\u0000XY\u0005\u0007\u0000\u0000YZ\u0005\t"+
		"\u0000\u0000Z\u0015\u0001\u0000\u0000\u0000\u0007\u001c!-:=EJ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}