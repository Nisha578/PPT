const quizQuestions = [
  {
    question: "A report generator is used to ",
    options: [
      "update files",
      "print files on paper",
      "data entry",
      "All of the above",
    ],
    correctAnswer: "print files on paper",
  },
  {
    question: "Which of the following is not a logical data-base structure?",
    options: ["tree", "relational", "network", "chain"],
    correctAnswer: "chain",
  },
  {
    question: "Which of the following is a database administrator's function?",
    options: [
      "database design",
      "backing up the database",
      "performance monitoring",
      "All of the above",
    ],
    correctAnswer: "All of the above",
  },
  {
    question:
      "Primitive operations common to all record management systems include",
    options: ["Print", "Sort", "Look-up", "None of the above"],
    correctAnswer: "Look-up",
  },
  {
    question:
      "In SQL, which command is used to make permanent changes made by statements issue since the beginning of a transaction?",
    options: ["ZIP", "PACK", "COMMIT", "SAVE"],
    correctAnswer: "COMMIT",
  },
];

let currentQuestion = 0;
let score = 0;
const questionElement = document.getElementById("question");
const optionsElement = document.getElementById("options");
const submitButton = document.getElementById("submit-btn");
const feedbackElement = document.getElementById("feedback");
const scoreElement = document.getElementById("score");
const resultElement = document.getElementById("result");
const scoreContainer = document.getElementById("score-container");

const displayQuestion = () => {
  const { question, options } = quizQuestions[currentQuestion];
  questionElement.textContent = `Question ${currentQuestion + 1}: ${question}`;
  optionsElement.innerHTML = "";

  //  Create a default option
  const defaultOption = document.createElement("option");
  defaultOption.textContent = "--Please choose an option--";
  optionsElement.appendChild(defaultOption);

  options.forEach((option) => {
    const optionElement = document.createElement("option");
    optionElement.textContent = option;
    optionsElement.appendChild(optionElement);
  });
};

const handleOptionSubmit = () => {
  const selectedOption = optionsElement.value;
  const { correctAnswer } = quizQuestions[currentQuestion];

  if (selectedOption === "--Please choose an option--") {
    return;
  }

  const isCorrect = selectedOption === correctAnswer;
  isCorrect ? score++ : null;

  feedbackElement.textContent = isCorrect
    ? "Status: Correct!"
    : "Status: Wrong answer!";
  feedbackElement.classList.add(isCorrect ? "correct" : "incorrect");
  feedbackElement.classList.remove(isCorrect ? "incorrect" : "correct");

  if (!isCorrect) {
    feedbackElement.style.background = "red";
  } else {
    feedbackElement.style.background = "green";
  }

  currentQuestion++;

  if (currentQuestion < quizQuestions.length) {
    displayQuestion();
  } else {
    submitButton.style.display = "none";
    scoreContainer.style.display = "flex";
    showScore();
  }
};

const showScore = () => {
  scoreElement.innerHTML = `<tr><th>Total Right Question
    <td>${score}</td 
    </th>
    </tr>

    <tr>
    <th>Total Wrong Question</th>
    <td>${quizQuestions.length - score}</td>
    </tr>`;
  scoreElement.style.margin = "10px";
  scoreContainer.style.width = "550px";
  scoreContainer.style.marginTop = "-500px";

  resultElement.textContent = getResultMessage();
};

const getResultMessage = () => {
  const percentage = (score / quizQuestions.length) * 100;

  if (percentage === 100) {
    return "Congratulations! You got a perfect score!";
  } else if (percentage >= 80) {
    return "Great job! You did really well!";
  } else if (percentage >= 60) {
    return "Good effort! You passed the quiz.";
  } else {
    return "Keep practicing! You can improve.";
  }
};

submitButton.addEventListener("click", handleOptionSubmit);

displayQuestion();
