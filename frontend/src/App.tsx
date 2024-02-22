import {useEffect, useState} from 'react'
import './App.css'
import {GameOfLife} from 'scalajs:main.js'
import Board, {CellData} from "./Board.tsx";

export function App() {
  const [board, setBoard] = useState<CellData[]>([])

  const boardWidth = 20
  const boardHeight = 10

  useEffect(() => {
    const cleanup = GameOfLife.run(boardWidth, boardHeight, 100, (b: CellData[]) => setBoard(b))
    console.info("Board loaded")
    return () => {
      console.info("Board unloaded")
      cleanup()
    }
  }, []);

  return (
    <Board board={board} boardWidth={boardWidth} boardHeight={boardHeight} />
  )
}

