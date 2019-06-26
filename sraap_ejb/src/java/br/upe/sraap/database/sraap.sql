-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 20-Jun-2019 às 19:13
-- Versão do servidor: 10.1.38-MariaDB
-- versão do PHP: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sysraap`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `administrador`
--

CREATE TABLE `administrador` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nome` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `administrador`
--

INSERT INTO `administrador` (`id`, `nome`, `email`, `senha`) VALUES
(1, 'Matheus', 'matheus@gmail.com', '123'),
(2, 'José', 'jose@gmail.com', '123'),
(3, 'Carlo', 'carlo@gmail.com', '123'),
(4, 'Raul', 'raul@gmail.com', '123');

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluno`
--

CREATE TABLE `aluno` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nome` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL,
  `perfil` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `aluno`
--

INSERT INTO `aluno` (`id`, `nome`, `email`, `senha`, `perfil`) VALUES
(1, 'Chales', 'charles@gmail.com', '123', 'Teórico'),
(2, 'Diego', 'diego@gmail.com', '123', 'Reflexivo'),
(3, 'Rafael', 'rafael@gmail.com', '123', 'Pragmático'),
(4, 'Jennifer', 'jennifer@gmail.com', '123', 'Ativo'),
(5, 'Nathália', 'nathalia@gmail.com', '123', 'Teórico'),
(6, 'Clara', 'clara@gmail.com', '123', 'Reflexivo'),
(7, 'Raquel', 'raquel@gmail.com', '123', 'Pragmático');

-- --------------------------------------------------------

--
-- Estrutura da tabela `atividade`
--

CREATE TABLE `atividade` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `id_turma` bigint(20) NOT NULL,
  `titulo` varchar(100) NOT NULL,
  `link` varchar(100) NOT NULL,
  `descricao` varchar(200) NOT NULL,
  `perfil` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `avaliacao_do_professor`
--

CREATE TABLE `avaliacao_do_professor` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `id_turma` bigint(20) NOT NULL,
  `conceito1` int(11) NOT NULL,
  `conceito2` int(11) NOT NULL,
  `conceito3` int(11) NOT NULL,
  `conceito4` int(11) NOT NULL,
  `conceito5` int(11) NOT NULL,
  `conceito6` int(11) NOT NULL,
  `conceito7` int(11) NOT NULL,
  `conceito8` int(11) NOT NULL,
  `conceito9` int(11) NOT NULL,
  `conceito10` int(11) NOT NULL,
  `conceito11` int(11) NOT NULL,
  `conceito12` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `avaliacao_do_professor`
--

INSERT INTO `avaliacao_do_professor` (`id`, `id_turma`, `conceito1`, `conceito2`, `conceito3`, `conceito4`, `conceito5`, `conceito6`, `conceito7`, `conceito8`, `conceito9`, `conceito10`, `conceito11`, `conceito12`) VALUES
(1, 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(2, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(3, 3, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);

-- --------------------------------------------------------

--
-- Estrutura da tabela `professor`
--

CREATE TABLE `professor` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nome` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `professor`
--

INSERT INTO `professor` (`id`, `nome`, `email`, `senha`) VALUES
(1, 'Revoredo', 'revoredo@gmail.com', '123'),
(2, 'Cleyton', 'cleyton@gmail.com', '123'),
(3, 'Ariane', 'ariane@gmail.com', '123'),
(4, 'Ivaldir', 'ivaldir@gmail.com', '123');

-- --------------------------------------------------------

--
-- Estrutura da tabela `turma`
--

CREATE TABLE `turma` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `id_professor` bigint(20) NOT NULL,
  `ano` varchar(100) NOT NULL,
  `descricao` varchar(200) NOT NULL,
  `disciplina` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `turma`
--

INSERT INTO `turma` (`id`, `id_professor`, `ano`, `descricao`, `disciplina`) VALUES
(1, 1, '7º Período', 'descrição', 'Tópicos Integradores II'),
(2, 1, '1º Período', 'descrição', 'Programação I'),
(3, 2, '5º Período', 'descrição', 'Teoria da computação'),
(4, 2, '6º Período', 'descrição', 'Inteligência Artificial'),
(5, 3, '5º Período', 'descrição', 'Computação Gráfica'),
(6, 4, '7º Período', 'descrição', 'Planejamento e Gerênciamento de projetos');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `aluno`
--
ALTER TABLE `aluno`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `atividade`
--
ALTER TABLE `atividade`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_turma_fk` (`id_turma`);

--
-- Indexes for table `avaliacao_do_professor`
--
ALTER TABLE `avaliacao_do_professor`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_turma_fk` (`id_turma`);

--
-- Indexes for table `professor`
--
ALTER TABLE `professor`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `turma`
--
ALTER TABLE `turma`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_professor_fk` (`id_professor`) USING BTREE;

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `administrador`
--
ALTER TABLE `administrador`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `aluno`
--
ALTER TABLE `aluno`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `avaliacao_do_professor`
--
ALTER TABLE `avaliacao_do_professor`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `professor`
--
ALTER TABLE `professor`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `turma`
--
ALTER TABLE `turma`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
