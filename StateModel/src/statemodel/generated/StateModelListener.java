// Generated from D:/Documents/modell/modell-hf1/StateModel/src/statemodel/StateModel.g4 by ANTLR 4.13.2
package statemodel.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StateModelParser}.
 */
public interface StateModelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StateModelParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(StateModelParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(StateModelParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#states}.
	 * @param ctx the parse tree
	 */
	void enterStates(StateModelParser.StatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#states}.
	 * @param ctx the parse tree
	 */
	void exitStates(StateModelParser.StatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#initialState}.
	 * @param ctx the parse tree
	 */
	void enterInitialState(StateModelParser.InitialStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#initialState}.
	 * @param ctx the parse tree
	 */
	void exitInitialState(StateModelParser.InitialStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(StateModelParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(StateModelParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#errorState}.
	 * @param ctx the parse tree
	 */
	void enterErrorState(StateModelParser.ErrorStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#errorState}.
	 * @param ctx the parse tree
	 */
	void exitErrorState(StateModelParser.ErrorStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#labels}.
	 * @param ctx the parse tree
	 */
	void enterLabels(StateModelParser.LabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#labels}.
	 * @param ctx the parse tree
	 */
	void exitLabels(StateModelParser.LabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#labelList}.
	 * @param ctx the parse tree
	 */
	void enterLabelList(StateModelParser.LabelListContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#labelList}.
	 * @param ctx the parse tree
	 */
	void exitLabelList(StateModelParser.LabelListContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#transitions}.
	 * @param ctx the parse tree
	 */
	void enterTransitions(StateModelParser.TransitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#transitions}.
	 * @param ctx the parse tree
	 */
	void exitTransitions(StateModelParser.TransitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#transitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTransitionDefinition(StateModelParser.TransitionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#transitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTransitionDefinition(StateModelParser.TransitionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(StateModelParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(StateModelParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(StateModelParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(StateModelParser.TransitionContext ctx);
}