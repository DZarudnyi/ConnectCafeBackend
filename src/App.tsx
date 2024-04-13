import React from 'react';
import './App.css';
import { Footer } from './components/Footer';
import { Header } from './components/Header';
import { Outlet } from 'react-router-dom';

function App() {
  return (
    <div className="flex flex-col h-screen">
      <Header />
      <main className="h-full">
        <Outlet />
      </main>
      <Footer />
    </div>
  );
}

export default App;
