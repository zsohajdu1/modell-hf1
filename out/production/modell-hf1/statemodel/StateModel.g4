grammar StateModel;

model: states transitions;

states: STATES LCURLY initialState? state* RCURLY;
initialState: INITIAL ID labels;
state: ID labels errorState?;
errorState: ERROR;
labels: LCURLY labelList RCURLY;
labelList: (ID (COMMA ID)*)?;

transitions: TRANSITIONS LCURLY (transitionDefinition transition*)* RCURLY;
transitionDefinition: TRANS type ID;
type: NORMAL | ERROR;
transition: ID COLON ID ARROW ID;

STATES: 'states';
TRANSITIONS: 'transitions';
INITIAL: 'initial';
ERROR: 'error';
NORMAL: 'normal';
COLON: ':';
ARROW: '->';
TRANS: 'trans';
ID: [A-Za-z][A-Za-z0-9]*;
LCURLY: '{';
RCURLY: '}';
COMMA: ',';
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
WS: [\t\r\n ] -> skip;